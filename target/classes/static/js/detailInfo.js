

function getDetailInfo(jobId) {
    //获得职位基本信息
    var career_url = "company/jobDetail";
    $.ajax({
        type:'post',
        url:career_url,
        data:JSON.stringify({"jobId": jobId}),
        contentType:'application/json;charset=utf-8',
        success:function (data) {
            showDetailInfo(data);
            var companyName = data.companyName;
            var jobId =data.jobId;
            getCompanyImage(companyName);
            getSkillImage(jobId);
            getRadar(companyName);
        }
    });

}

function getCompanyImage(keywords) {
    var image_url = "/statistics/company/keywords";
    $.ajax({
        type:'post',
        url:image_url,
        data: JSON.stringify({"companyName": keywords}),
        contentType:'application/json;charset=utf-8',
        success:function (data) {
            showCompanyInfo(data);
        }
    });
}

function getSkillImage(keywords) {
    var image_url = "/statistics/job/keywords/"+ keywords;
    $.ajax({
        type:'get',
        url:image_url,
        contentType:'application/json;charset=utf-8',
        success:function (data) {
            showSkillInfo(data);
        }
    });
}


function getRadar(keywords) {
    var image_url = "";
    $.ajax({
        type:'get',
        url:image_url,
        contentType:'application/json;charset=utf-8',
        success:function (data) {
            var a = Math.random() % 5;
            data ={"meanLevel": [73, 69, 91, 96, 84],
                "personalLevel": [84 + a, 67 + a, 78 + a, 84 + a, 91 + a]
            };
            showRadarInfo(data);
        }
    });
    var a = (Math.random()* 100) % 5;
    data ={"meanLevel": [73, 69, 91, 96, 84],
        "personalLevel": [84 + a, 67 + a, 78 + a, 84 + a, 91 + a]
    };
    showRadarInfo(data);
}



function showDetailInfo(data) {

    $("#company_name").text(data.companyName);
    $("#company_addr").text(data.jobLocation);
    $("#detail_salary").text(data.salary);
    $("#detail_position").text(data.jobName);
    $("#detail_quality").text(data.companyNature);
    $("#detail_level").text(data.companyPeopleNum);
    $("#detail_edu").text(data.educationDegree);
    $("#detail_exp").text(data.jobExperience);
    $("#detail_num").text(data.jobPeopleNum);
    $("#detail_time").text(data.jobTime);
    $("#detail_position_para").html(data.jobDescriptionHtml)
    $("#detail_company_para").html(data.companyDescriptionHtml)
    $("#detail_contact").html(data.welfare)

}


function showCompanyInfo(keywords) {
    var data = [];
    for (var i = 0; i < keywords.length ; i++) {
        data.push({
            name: keywords[i].word,
            value: Math.sqrt(keywords[i].weight)
        })
    }

    var option = {
        backgroundColor: '#fff',
        title: {
            text: '',
        },
        tooltip : {},
        series : [ {
            type : 'wordCloud',
            shape:'smooth',
            gridSize :20,
            sizeRange : [ 10, 80 ],
            rotationRange : [ 1, 60 ],
            textStyle : {
                normal : {
                    color : function() {
                        return 'rgb('
                            + [ Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160) ]
                                .join(',') + ')';
                    }
                },
                emphasis : {
                    shadowBlur : 10,
                    shadowColor : '#333'
                }
            },
            data : data
        } ]
    };
    var myChart = echarts.init(document.getElementById('imgblock2'));
    myChart.setOption(option);
    window.onresize = function() {
        myChart.resize();
    }

}

function showSkillInfo(keywords) {
    var data = [];

    for (var i = 0; i < keywords.length ; i++) {
        data.push({
            name: keywords[i].word,
            value: Math.sqrt(keywords[i].weight)
        })
    }

    var option = {
        backgroundColor: '#fff',
        title: {
            text: '',
        },
        tooltip : {},
        series : [ {
            type : 'wordCloud',
            shape:'smooth',
            gridSize :20,
            sizeRange : [ 10, 80 ],
            rotationRange : [ 1, 60 ],
            textStyle : {
                normal : {
                    color : function() {
                        return 'rgb('
                            + [ Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160) ]
                                .join(',') + ')';
                    }
                },
                emphasis : {
                    shadowBlur : 10,
                    shadowColor : '#333'
                }
            },
            data : data
        } ]
    };
    var myChart = echarts.init(document.getElementById('imgblock1'));
    myChart.setOption(option);
    window.onresize = function() {
        myChart.resize();
    }
}

function showHeatInfo(keywords) {
    var data = [];

    for (var i = 0; i < keywords.length ; i++) {
        data.push({
            name: keywords[i].word,
            value: 1
        })
    }
    for (var i = 0; i < keywords.length ; i++) {
        data.push({
            name: keywords[i].word,
            value: 1
        })
    }
    var option = {
        backgroundColor: '#fff',
        title: {
            text: '',
        },
        tooltip : {},
        series : [ {
            type : 'wordCloud',
            shape:'smooth',
            gridSize :20,
            sizeRange : [ 20, 30 ],
            rotationRange : [ 1, 60 ],
            textStyle : {
                normal : {
                    color : function() {
                        return 'rgb('
                            + [ Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160) ]
                                .join(',') + ')';
                    }
                },
                emphasis : {
                    shadowBlur : 10,
                    shadowColor : '#333'
                }
            },
            data : data
        } ]
    };
    var myChart = echarts.init(document.getElementById('heatImage'));
    myChart.setOption(option);
    window.onresize = function() {
        myChart.resize();
    }
}

function showRadarInfo(data) {

    var aveData = data.meanLevel;
    var personalData = data.personalLevel;


    var dom = document.getElementById("rander");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: ''
        },
        tooltip: {},
        legend: {
            data: ['平均水平','个人水平']
        },
        radar: {
            // shape: 'circle',
            name: {
                textStyle: {
                    color: '#808080',
                    backgroundColor: '#fff',
                    borderRadius: 3,
                    padding: [3, 5]
                }
            },
            indicator: [
                { name: '第一学历', max: 100},
                { name: '管理', max: 100},
                { name: '团队协作', max: 100},
                { name: '职业技能', max: 100},
                { name: '薪酬', max: 100}
            ]
        },
        series: [{
            name: '',
            type: 'radar',
            data : [
                {
                    value : aveData ,
                    name : '平均水平'
                },
                {
                    value : personalData,
                    name : '个人水平'
                }
            ]
        }]
    };;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
}

