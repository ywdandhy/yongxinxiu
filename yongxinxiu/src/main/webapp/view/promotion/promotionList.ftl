
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<#include "/view/resource/resource.ftl" />
<script src="/staticPage/js/index/index.js"></script>
<link href="/staticPage/css/promotion.css" rel="stylesheet">

</head>
<body>
<div id="indexHeader"></div>
<#include "/view/promotion/promotionCarousel.ftl" />
<div class="container">
	
	<!--活动类型聚合-->
	<#list promList as prom>
		<#if prom_index%2==0>
		<hr class="featurette-divider">
			<div class="row featurette">
		     <div class="col-md-7">
		         <h2>${prom.title}</h2>
		         <p class="lead">${prom.description}</p>     	 
			     <span class="promotion_price">￥${prom.nowPrice}</span>
			     <span class="promotion_price_old">原价：¥${prom.originalPrice}</span>
			     <span><button type="button" class="btn btn-info">立即购买</button></span>
			     <div class="temaiTime progress" >
			     	<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="20" aria-valuemin="2" aria-valuemax="100" style="width:50%;">
				  	</div>
		            <div class="temaiTime_text">剩余时间：2天17时06分09秒</div>
		         </div>
		     </div>
		     <div class="col-md-5">
		          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="/staticPage/images/index/promotion7.jpg">
		     </div>
		 	</div>
			<#else>
			<hr class="featurette-divider">
			<div class="row featurette">
		        <div class="col-md-5">
		          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="/staticPage/images/index/promotion8.jpg">
		        </div>
		        <div class="col-md-7">
		          <h2>${prom.title}</h2>
		          <p class="lead">${prom.description}</p>
		          <span class="promotion_price">￥${prom.nowPrice}</span>
			      <span class="promotion_price_old">原价：¥${prom.originalPrice}</span>
			      <span><button type="button" class="btn btn-info">立即购买</button></span>
			      <div class="temaiTime progress" >
			     	<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="20" aria-valuemin="2" aria-valuemax="100" style="width:50%;">
				  	</div>
		            <div class="temaiTime_text">剩余时间：2天17时06分09秒</div>
		          </div>
		        </div>
			</div>
		</#if>
	</#list>
	
	
	<hr class="featurette-divider">
	<#include "/view/footer.ftl" />
</div>

</body>
</html>

