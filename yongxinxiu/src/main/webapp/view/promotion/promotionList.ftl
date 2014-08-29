
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
<hr class="featurette-divider">
<!--活动类型聚合-->
<#include "/view/promotion/promotionLeft.ftl" />
<hr class="featurette-divider">
<#include "/view/promotion/promotionRight.ftl" />
<hr class="featurette-divider">
</div>
</body>
</html>

