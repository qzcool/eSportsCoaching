
$(function () {
    $("#datetimepicker1").datetimepicker({
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        todayHighlight: true,
        showMeridian: true,
        pickerPosition: "bottom-left",
        language: 'zh-CN',
        startView: 2,
        minView: 2
    });
    var today = new Date();
    var nowdate = (today.getFullYear()) + "-" + (today.getMonth() + 1) + "-" + today.getDate();
    var date = new Date(nowdate);
    var mon = date.getMonth() + 1;
    var day = date.getDate();
    var mydate = date.getFullYear() + "-" + (mon < 10 ? "0" + mon : mon) + "-" + (day < 10 ? "0" + day : day);
    // document.getElementById("nowdate").value = mydate;

    $(".dropdown-toggle").dropdown('toggle');

    $("#canlender-titile").text(date.getFullYear() + '.' + mon);
});