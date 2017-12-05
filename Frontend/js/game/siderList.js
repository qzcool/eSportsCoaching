var siderTextForSensei = {
    '课程': ['我的课程', '我的评论', '免费课程'],
    '钱包': ['账户余额', '交易记录'],
    '首选项': ['个人信息', '账户设置','支付方式']
};

var leftBar = document.getElementById('leftBar');

function init() {
    for (var i in siderTextForSensei) {
        var div = document.createElement('div');
        div.setAttribute('class', 'listInfo');
        leftBar.appendChild(div);
        var divF = document.createElement('div');
        divF.setAttribute('class', 'col-xs-12');
        var span = docuement.createElement('span');
        var ul = document.createElement('ul');
        divF.appendChild(span);
        divF.appendChild(ul);
        div.appendChild(divF);
    }
}