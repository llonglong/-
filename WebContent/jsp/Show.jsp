<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
<title>Insert title here</title>
	<script type="text/javascript">
       $(function() {
           $.ajax({
               url:"${pageContext.request.contextPath}/province/selectProvinces",
               dataType:"json",
               success:function(data,textStatus,ajax){
                  alert(ajax.responseText);
                  //append_template(data, "province");
                  var html = "<option>-请选择-</option>";
                  for(var i=0;i<data.length;i++){
                      html +="<option value='"+data[i].id+"'>"+data[i].province+"</option>";
                  }
                   $("#province").html(html);
               }
           });
       });
       
       function selectCitys(obj) {
           var provinceId = $(obj).val();
           //清空城市下拉框中的内容，出第一项外
           $("#city option:gt(0)").remove();
           //清空地区下拉框中的内容，出第一项外
           $("#area option:gt(0)").remove();
           $.ajax({
               url:"${pageContext.request.contextPath}/province/selectCitys",
               data:"provinceId="+provinceId,
               dataType:"json",
               success:function(data,textStatus,ajax){
                  alert(ajax.responseText);
                  //append_template(data, "city");
                  
                  var html = "<option>-请选择-</option>";
                  for(var i=0;i<data.length;i++){
                      html +="<option value='"+data[i].id+"'>"+data[i].city+"</option>";
                  }
                  $("#city").html(html);
               }
           });
       }
       
       function selectAreas(obj) {
           var cityId = $(obj).val();
           //清空地区下拉框中的内容，出第一项外
           $("#area option:gt(0)").remove();
           $.ajax({
               url:"${pageContext.request.contextPath}/province/selectAreas",
               data:"cityId="+cityId,
               dataType:"json",
               success:function(data,textStatus,ajax){
                  alert(ajax.responseText);
                  //append_template(data, "area");
                  
                  var html = "<option>-请选择-</option>";
                  for(var i=0;i<data.length;i++){
                      html +="<option value='"+data[i].id+"'>"+data[i].area+"</option>";
                  }
                  $("#area").html(html);
               }
           });
       }
       
       //封装其通用内容
       function append_template(jsonData,target){
           var length = jsonData.length;
           var html = "<option>-请选择-</option>";
           for(var i=0;i<length;i++){
               html +="<option value='"+data[i].id+"'>"+data[i].province+"</option>";
           }
           $("#"+target).html(html);
       };
    </script>

</head>
<body>
	省份:
    <select id="province" onchange="selectCitys(this)">
       <option value="">-请选择-</option>
    </select>
          城市:
    <select id="city" onchange="selectAreas(this)">
       <option value="">-请选择-</option>
    </select>
          区域:
    <select id="area">
       <option value="">-请选择-</option>
    </select>
	
</body>
</html>