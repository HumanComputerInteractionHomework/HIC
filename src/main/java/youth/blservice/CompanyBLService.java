package youth.blservice;

import youth.bean.*;

import java.util.List;

public interface CompanyBLService {


    public ResultMessageBean companyRemark(String phone,String company,int recomandScore,
                                           int futureScore,int ceoScore, String remark);
    public CompanyRemarkBean getCompanyRemark(String company);




}
