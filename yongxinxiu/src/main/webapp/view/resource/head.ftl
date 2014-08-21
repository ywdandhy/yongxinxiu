 <div class="navbar  navbar-fixed-top">
  <div class="navbar-inner">
  <div class="container">
  <div class="nav-collapse collapse">
    <a class="brand" href="#">51结婚</a>
    <ul class="nav ">
      <li class="active"><a href="#">主页</a></li>
	</ul>
	<ul class="nav pull-right">
	  <#if isLogin>
          		<li><a href="#">您好,${name}</a></li>
            	<li><a href="#" id="loginOut">退出</a></li>
         <#else>
          		<li><a href="#" class="login">登陆</a></li>
            	<li><a href="#" class="login" >注册</a></li>
      </#if>  
     </ul>
  </div>
    
  </div>
     
  </div>
</div>
    
<div id="loginDia" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:660px">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">登陆/注册</h3>
  </div>
  <div class="modal-body" >
  </div>
 
</div>
