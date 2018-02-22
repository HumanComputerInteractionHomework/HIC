package youth.bl;
//.....


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youth.bean.*;
import youth.blservice.CompanyBLService;
import youth.blservice.UserBLService;
import youth.dao.*;
import youth.model.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class CompanyBL implements CompanyBLService {

    @Autowired
    private CompanyRemarkRepository companyRemarkRepository;

    @Autowired
    private SingleCompanyRemarkRepository singleCompanyRemarkRepository;


    @Override
    @Transactional
    public ResultMessageBean companyRemark(String phone, String company, int recomandScore, int futureScore, int ceoScore, String remark) {

        //更新single_company_remark表
        SingleCompanyRemark s=new SingleCompanyRemark
                (phone,company,recomandScore,futureScore,ceoScore,remark);
        try {
            singleCompanyRemarkRepository.save(s);
        } catch (Exception e) {
            return new ResultMessageBean(false, "填写公司评价信息失败");
        }

        //更新company_remark表
        List<SingleCompanyRemark> list=singleCompanyRemarkRepository.findByCompany(company);
        double avgRecomandScore=0.0;
        double avgFutureScore=0.0;
        double avgCeoScore=0.0;

        for(SingleCompanyRemark singleCompanyRemark:list){
            avgRecomandScore+=singleCompanyRemark.getRecomandScore();
            avgFutureScore+=singleCompanyRemark.getFutureScore();
            avgCeoScore+=singleCompanyRemark.getCeoScore();
        }
        avgRecomandScore/=list.size();
        avgFutureScore/=list.size();
        avgCeoScore/=list.size();

        CompanyRemark companyRemark=new CompanyRemark(company,avgRecomandScore,avgFutureScore,avgCeoScore);
        try {
            //先删除再插入=更新
            companyRemarkRepository.deleteByCompany(company);
            companyRemarkRepository.save(companyRemark);
        } catch (Exception e) {
            return new ResultMessageBean(false, "填写公司评价信息失败");
        }


        return new ResultMessageBean(true);
    }

    @Override
    public CompanyRemarkBean getCompanyRemark(String company) {

        CompanyRemarkBean companyRemarkBean=new CompanyRemarkBean();
        List<SingleCompanyRemark> list=singleCompanyRemarkRepository.findByCompany(company);
        double avgRecomandScore=0.0;
        double avgFutureScore=0.0;
        double avgCeoScore=0.0;

        List<SingleCompanyRemarkBean> beansList=new ArrayList<SingleCompanyRemarkBean>();

        for(SingleCompanyRemark singleCompanyRemark:list){
            SingleCompanyRemarkBean singleCompanyRemarkBean=new SingleCompanyRemarkBean();
            BeanUtils.copyProperties(singleCompanyRemark,singleCompanyRemarkBean);
            beansList.add(singleCompanyRemarkBean);
            avgRecomandScore+=singleCompanyRemark.getRecomandScore();
            avgFutureScore+=singleCompanyRemark.getFutureScore();
            avgCeoScore+=singleCompanyRemark.getCeoScore();
        }
        avgRecomandScore/=list.size();
        avgFutureScore/=list.size();
        avgCeoScore/=list.size();


        companyRemarkBean.setCompany(company);
        companyRemarkBean.setAvgRecomandScore(avgRecomandScore);
        companyRemarkBean.setAvgFutureScore(avgFutureScore);
        companyRemarkBean.setAvgCeoScore(avgCeoScore);
        companyRemarkBean.setSingleCompanyRemarkBeans(beansList);

        return companyRemarkBean;

    }
}
