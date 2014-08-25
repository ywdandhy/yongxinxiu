<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<#include "/view/resource/resource.ftl" />
<script src="/staticPage/js/index/index.js"></script>
</head>
<body>
<div id="indexHeader"></div>
<#include "/view/indexCarousel.ftl" />
<div class="container marketing">
      <!-- START THE FEATURETTES -->
      <!--活动类型聚合-->
      <#include "/view/promotionType.ftl" />
      <!-- /END THE FEATURETTES -->
      <!--具体活动推广-->
	  <#include "/view/promotionList.ftl" />
      <!-- FOOTER -->
      <#include "/view/footer.ftl" />
    </div>
</body>
</html>
