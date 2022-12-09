package org.BMC;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateAPi {
	@Test
	public void update() {

	String payload = "{<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n" + 
			"  <title>Loading...</title>\r\n" + 
			"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
			"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
			"  <link href=\"vendor/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n" + 
			"  <link href=\"vendor/prism.css\" rel=\"stylesheet\" />\r\n" + 
			"  <link href=\"css/style.css\" rel=\"stylesheet\" media=\"screen, print\">\r\n" + 
			"  <link href=\"img/favicon.ico\" rel=\"icon\" type=\"image/x-icon\">\r\n" + 
			"  <script src=\"vendor/polyfill.js\"></script>\r\n" + 
			"  <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-118712228-2\"></script>\r\n" + 
			"	<script>\r\n" + 
			"		window.dataLayer = window.dataLayer || [];\r\n" + 
			"		function gtag(){dataLayer.push(arguments);\r\n" + 
			"}\r\n" + 
			"		gtag('js', new Date());\r\n" + 
			"\r\n" + 
			"		gtag('config', 'UA-118712228-2');\r\n" + 
			"	</script>\r\n" + 
			"</head>\r\n" + 
			"<body class=\"container-fluid\">\r\n" + 
			"\r\n" + 
			"<script id=\"template-sidenav\" type=\"text/x-handlebars-template\">\r\n" + 
			"<nav id=\"scrollingNav\">\r\n" + 
			"  <div class=\"sidenav-search\">\r\n" + 
			"    <input class=\"form-control search\" type=\"text\" placeholder=\"{{__ \"Filter...\"}}\">\r\n" + 
			"    <span class=\"search-reset\">x</span>\r\n" + 
			"  </div>\r\n" + 
			"  <ul class=\"sidenav nav nav-list list\">\r\n" + 
			"  {\r\n" + 
			"    {#each nav\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#if title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if isHeader\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#if isFixed\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <li class=\"nav-fixed nav-header navbar-btn nav-list-item\" data-group=\"{{group}}\"><a href=\"#api-{{group}}\" data-name=\"show-api-{{group}}\" class=\"show-api api-{{group}}-init\">{\r\n" + 
			"    {underscoreToSpace title\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <li class=\"nav-header nav-list-item\" data-group=\"{{group}}\"><a href=\"#api-{{group}}\" data-group=\"show-api-{{group}}\" class=\"show-group api-{{group}}-init\">{\r\n" + 
			"    {underscoreToSpace title\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li class=\"{{#if hidden}}hide {{/if}}\" data-group=\"{{group}}\" data-name=\"{{name}}\" data-version=\"{{version}}\">\r\n" + 
			"          <a href=\"#api-{{group}}-{{name}}\" title=\"{{url}}\" data-group=\"show-api-{{group}}\" data-name=\"show-api-{{group}}-{{name}}\" class=\"nav-list-item show-api api-{{group}}-{{name}}-init\">{\r\n" + 
			"    {title\r\n" + 
			"    }\r\n" + 
			"}<div class=\"nav-list-url-item hide\">{\r\n" + 
			"    {url\r\n" + 
			"    }\r\n" + 
			"}</div></a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </ul>\r\n" + 
			"</nav>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-project\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <div class=\"pull-left\">\r\n" + 
			"    <h1>{\r\n" + 
			"    {name\r\n" + 
			"    }\r\n" + 
			"}</h1>\r\n" + 
			"    {\r\n" + 
			"    {#if description\r\n" + 
			"    }\r\n" + 
			"}<h2>{\r\n" + 
			"    {\r\n" + 
			"        {nl2br description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</h2>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <p><a href=\"https://www.buymeacoffee.com/mwinteringham\"><img src=\"https://img.buymeacoffee.com/button-api/?text=Buy me a tea&emoji=&slug=mwinteringham&button_colour=5F7FFF&font_colour=ffffff&font_family=Lato&outline_colour=000000&coffee_colour=FFDD00\"></a></p>\r\n" + 
			"  </div>\r\n" + 
			"  <div class=\"pull-right\">\r\n" + 
			"    {\r\n" + 
			"    {#if template.withCompare\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div class=\"btn-group\">\r\n" + 
			"      <button id=\"version\" class=\"btn btn-lg btn-default dropdown-toggle\" data-toggle=\"dropdown\">\r\n" + 
			"        <strong>{\r\n" + 
			"    {version\r\n" + 
			"    }\r\n" + 
			"}</strong>&nbsp;<span class=\"caret\"></span>\r\n" + 
			"      </button>\r\n" + 
			"      <ul id=\"versions\" class=\"dropdown-menu open-left\">\r\n" + 
			"        <li><a id=\"compareAllWithPredecessor\" href=\"#\">{\r\n" + 
			"    {__ \"Compare all with predecessor\"\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        <li class=\"divider\"></li>\r\n" + 
			"        <li class=\"disabled\"><a href=\"#\">{\r\n" + 
			"    {__ \"show up to version:\"\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"      {\r\n" + 
			"    {#each versions\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li class=\"version\"><a href=\"#\">{\r\n" + 
			"    {this\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"      {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </ul>\r\n" + 
			"    </div>\r\n" + 
			"    {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div id=\"version\" class=\"well well-sm\">\r\n" + 
			"      <strong>{\r\n" + 
			"    {version\r\n" + 
			"    }\r\n" + 
			"}</strong>\r\n" + 
			"    </div>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </div>\r\n" + 
			"  <div class=\"clearfix\"></div>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-header\" type=\"text/x-handlebars-template\">\r\n" + 
			"  {\r\n" + 
			"    {#if content\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div id=\"api-_\" class=\"show-api-article show-api-_-article\">{\r\n" + 
			"    {\r\n" + 
			"        {content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</div>\r\n" + 
			"  {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-footer\" type=\"text/x-handlebars-template\">\r\n" + 
			"  {\r\n" + 
			"    {#if content\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div id=\"api-_footer\" class=\"show-api-article show-api-_-article\">{\r\n" + 
			"    {\r\n" + 
			"        {content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</div>\r\n" + 
			"  {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-generator\" type=\"text/x-handlebars-template\">\r\n" + 
			"  {\r\n" + 
			"    {#if template.withGenerator\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#if generator\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <div class=\"content\">\r\n" + 
			"        {\r\n" + 
			"    {__ \"Generated with\"\r\n" + 
			"    }\r\n" + 
			"} <a href=\"{{{generator.url}}}\">{\r\n" + 
			"    {\r\n" + 
			"        {generator.name\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</a> {\r\n" + 
			"    {\r\n" + 
			"        {generator.version\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"} - {\r\n" + 
			"    {\r\n" + 
			"        {generator.time\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </div>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-sections\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <section id=\"api-{{group}}\" class=\"show-api-group show-api-{{group}}-group {{#if aloneDisplay}} hide{{/if}}\">\r\n" + 
			"    <h1>{\r\n" + 
			"    {underscoreToSpace title\r\n" + 
			"    }\r\n" + 
			"}</h1>\r\n" + 
			"    {\r\n" + 
			"    {#if description\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p>{\r\n" + 
			"    {\r\n" + 
			"        {nl2br description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</p>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#each articles\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <div id=\"api-{{group}}-{{name}}\" class=\"show-api-article show-api-{{group}}-article show-api-{{group}}-{{name}}-article {{#if aloneDisplay}} hide{{/if}}\">\r\n" + 
			"        {\r\n" + 
			"    {\r\n" + 
			"        {article\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </div>\r\n" + 
			"    {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </section>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <article id=\"api-{{article.group}}-{{article.name}}-{{article.version}}\" {\r\n" + 
			"    {#if hidden\r\n" + 
			"    }\r\n" + 
			"}class=\"hide\"{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"} data-group=\"{{article.group}}\" data-name=\"{{article.name}}\" data-version=\"{{article.version}}\">\r\n" + 
			"    <div class=\"pull-left\">\r\n" + 
			"      <h1>{\r\n" + 
			"    {underscoreToSpace article.groupTitle\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {#if article.title\r\n" + 
			"    }\r\n" + 
			"} - {\r\n" + 
			"    {article.title\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</h1>\r\n" + 
			"    </div>\r\n" + 
			"    {\r\n" + 
			"    {#if template.withCompare\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div class=\"pull-right\">\r\n" + 
			"      <div class=\"btn-group\">\r\n" + 
			"        <button class=\"version btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\r\n" + 
			"          <strong>{\r\n" + 
			"    {article.version\r\n" + 
			"    }\r\n" + 
			"}</strong>&nbsp;<span class=\"caret\"></span>\r\n" + 
			"        </button>\r\n" + 
			"        <ul class=\"versions dropdown-menu open-left\">\r\n" + 
			"          <li class=\"disabled\"><a href=\"#\">{\r\n" + 
			"    {__ \"compare changes to:\"\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        {\r\n" + 
			"    {#each versions\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <li class=\"version\"><a href=\"#\">{\r\n" + 
			"    {this\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </ul>\r\n" + 
			"      </div>\r\n" + 
			"    </div>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <div class=\"clearfix\"></div>\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if article.author\r\n" + 
			"    }\r\n" + 
			"}<h4 class=\"muted\">Authored by: {\r\n" + 
			"    {article.author\r\n" + 
			"    }\r\n" + 
			"}</h4>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if article.deprecated\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p class=\"deprecated\"><span>{\r\n" + 
			"    {__ \"DEPRECATED\"\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"        {\r\n" + 
			"    {\r\n" + 
			"        {markdown article.deprecated.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </p>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if article.description\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p>{\r\n" + 
			"    {\r\n" + 
			"        {nl2br article.description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</p>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <span class=\"type type__{{toLowerCase article.type}}\">{\r\n" + 
			"    {toLowerCase article.type\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"    <pre data-type=\"{{toLowerCase article.type}}\"><code class=\"language-http\">{\r\n" + 
			"    {article.url\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if article.permission\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p>\r\n" + 
			"        {\r\n" + 
			"    {__ \"Permission:\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#each article.permission\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {name\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {#if title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{title}}\" data-content=\"{{nl2br description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"              <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </p>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {!-- CODE EXAMPLES IN TABS --\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#if_gt article.examples.length compare=0\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <ul class=\"nav nav-tabs nav-tabs-examples\">\r\n" + 
			"        {\r\n" + 
			"    {#each article.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <li{\r\n" + 
			"    {#if_eq @index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"            <a href=\"#examples-{{../id}}-{{@index}}\">{\r\n" + 
			"    {title\r\n" + 
			"    }\r\n" + 
			"}</a>\r\n" + 
			"          </li>\r\n" + 
			"        {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </ul>\r\n" + 
			"\r\n" + 
			"      <div class=\"tab-content\">\r\n" + 
			"      {\r\n" + 
			"    {#each article.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq @index compare=0}} active{{/if_eq}}\" id=\"examples-{{../id}}-{{@index}}\">\r\n" + 
			"          <pre data-type=\"{{type}}\"><code class=\"language-{{type}}\">{\r\n" + 
			"    {content\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </div>\r\n" + 
			"    {\r\n" + 
			"    {/if_gt\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-param-block\" params=article.header _hasType=_hasTypeInHeaderFields section=\"header\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-param-block\" params=article.parameter _hasType=_hasTypeInParameterFields section=\"parameter\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-param-block\" params=article.success _hasType=_hasTypeInSuccessFields section=\"success\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-param-block\" params=article.error _col1=\"Name\" _hasType=_hasTypeInErrorFields section=\"error\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-sample-request\" article=article id=id\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </article>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article-param-block\" type=\"text/x-handlebars-template\">\r\n" + 
			"  {\r\n" + 
			"    {#if params\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#each params.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <h2>{\r\n" + 
			"    {__ @key\r\n" + 
			"    }\r\n" + 
			"}</h2>\r\n" + 
			"      <table>\r\n" + 
			"        <thead>\r\n" + 
			"          <tr>\r\n" + 
			"          <th style=\"width: 30%\">{\r\n" + 
			"    {#if ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ \"Field\"\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"            {\r\n" + 
			"    {#if ../_hasType\r\n" + 
			"    }\r\n" + 
			"}<th style=\"width: 10%\">{\r\n" + 
			"    {__ \"Type\"\r\n" + 
			"    }\r\n" + 
			"}</th>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <th style=\"width: {{#if ../_hasType}}60%{{else}}70%{{/if}}\">{\r\n" + 
			"    {__ \"Description\"\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"          </tr>\r\n" + 
			"        </thead>\r\n" + 
			"        <tbody>\r\n" + 
			"        {\r\n" + 
			"    {#each this\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <tr>\r\n" + 
			"            <td class=\"code\">{\r\n" + 
			"    {\r\n" + 
			"        {splitFill field \".\" \"&nbsp;&nbsp;\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {#if optional\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"            {\r\n" + 
			"    {#if ../../_hasType\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              <td>\r\n" + 
			"                {\r\n" + 
			"    {\r\n" + 
			"        {type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              </td>\r\n" + 
			"            {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <td>\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {nl2br description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if defaultValue\r\n" + 
			"    }\r\n" + 
			"}<p class=\"default-value\">{\r\n" + 
			"    {__ \"Default value:\"\r\n" + 
			"    }\r\n" + 
			"} <code>{\r\n" + 
			"    {\r\n" + 
			"        {defaultValue\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></p>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if size\r\n" + 
			"    }\r\n" + 
			"}<p class=\"type-size\">{\r\n" + 
			"    {__ \"Size range:\"\r\n" + 
			"    }\r\n" + 
			"} <code>{\r\n" + 
			"    {\r\n" + 
			"        {size\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></p>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if allowedValues\r\n" + 
			"    }\r\n" + 
			"}<p class=\"type-size\">{\r\n" + 
			"    {__ \"Allowed values:\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              {\r\n" + 
			"    {#each allowedValues\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"                <code>{\r\n" + 
			"    {\r\n" + 
			"        {this\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code>{\r\n" + 
			"    {#unless @last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              </p>\r\n" + 
			"            {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            </td>\r\n" + 
			"          </tr>\r\n" + 
			"        {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </tbody>\r\n" + 
			"      </table>\r\n" + 
			"    {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#if_gt params.examples.length compare=0\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <ul class=\"nav nav-tabs nav-tabs-examples\">\r\n" + 
			"      {\r\n" + 
			"    {#each params.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq @index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#{{../section}}-examples-{{../id}}-{{@index}}\">{\r\n" + 
			"    {title\r\n" + 
			"    }\r\n" + 
			"}</a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </ul>\r\n" + 
			"\r\n" + 
			"      <div class=\"tab-content\">\r\n" + 
			"      {\r\n" + 
			"    {#each params.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq @index compare=0}} active{{/if_eq}}\" id=\"{{../section}}-examples-{{../id}}-{{@index}}\">\r\n" + 
			"        <pre data-type=\"{{type}}\"><code class=\"language-{{type}}\">{\r\n" + 
			"    {reformat content type\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      </div>\r\n" + 
			"    {\r\n" + 
			"    {/if_gt\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article-sample-request\" type=\"text/x-handlebars-template\">\r\n" + 
			"    {\r\n" + 
			"    {#if article.sampleRequest\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <h2>{\r\n" + 
			"    {__ \"Send a Sample Request\"\r\n" + 
			"    }\r\n" + 
			"}</h2>\r\n" + 
			"      <form class=\"form-horizontal\">\r\n" + 
			"        <fieldset>\r\n" + 
			"            <div class=\"form-group\">\r\n" + 
			"              <label class=\"col-md-3 control-label\" for=\"{{../id}}-sample-request-url\"></label>\r\n" + 
			"              <div class=\"input-group\">\r\n" + 
			"                <input id=\"{{../id}}-sample-request-url\" type=\"text\" class=\"form-control sample-request-url\" value=\"{{article.sampleRequest.0.url}}\" />\r\n" + 
			"                <span class=\"input-group-addon\">{\r\n" + 
			"    {__ \"url\"\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"              </div>\r\n" + 
			"            </div>\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if article.header\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#if article.header.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <h3>{\r\n" + 
			"    {__ \"Headers\"\r\n" + 
			"    }\r\n" + 
			"}</h3>\r\n" + 
			"          {\r\n" + 
			"    {#each article.header.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <h4><input type=\"checkbox\" data-sample-request-header-group-id=\"sample-request-header-{{@index}}\" name=\"{{../id}}-sample-request-header\" value=\"{{@index}}\" class=\"sample-request-header sample-request-switch\" checked />{\r\n" + 
			"    {__ @key\r\n" + 
			"    }\r\n" + 
			"}</h4>\r\n" + 
			"            <div class=\"{{../id}}-sample-request-header-fields\">\r\n" + 
			"              {\r\n" + 
			"    {#each this\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              <div class=\"form-group\">\r\n" + 
			"                <label class=\"col-md-3 control-label\" for=\"sample-request-header-field-{{field}}\">{\r\n" + 
			"    {field\r\n" + 
			"    }\r\n" + 
			"}</label>\r\n" + 
			"                <div class=\"input-group\">\r\n" + 
			"                  <input type=\"text\" placeholder=\"{{field}}\" value=\"{{defaultValue}}\" id=\"sample-request-header-field-{{field}}\" class=\"form-control sample-request-header\" data-sample-request-header-name=\"{{field}}\" data-sample-request-header-group=\"sample-request-header-{{@../index}}\">\r\n" + 
			"                  <span class=\"input-group-addon\">{\r\n" + 
			"    {\r\n" + 
			"        {type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"                </div>\r\n" + 
			"              </div>\r\n" + 
			"              {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            </div>\r\n" + 
			"          {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if article.parameter\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#if article.parameter.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <h3>{\r\n" + 
			"    {__ \"Parameters\"\r\n" + 
			"    }\r\n" + 
			"}</h3>\r\n" + 
			"          {\r\n" + 
			"    {#each article.parameter.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <h4><input type=\"checkbox\" data-sample-request-param-group-id=\"sample-request-param-{{@index}}\"  name=\"{{../id}}-sample-request-param\" value=\"{{@index}}\" class=\"sample-request-param sample-request-switch\" checked/>{\r\n" + 
			"    {__ @key\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              <select   name=\"{{../id}}-sample-header-content-type\" class=\"{{../id}}-sample-request-param-select sample-header-content-type sample-header-content-type-switch\">\r\n" + 
			"                <option value=\"undefined\"  selected>ajax-auto</option>\r\n" + 
			"                <option value=\"body-json\" >body/json</option>\r\n" + 
			"                <option value=\"body-form-data\" >body/form-data</option>\r\n" + 
			"              </select>\r\n" + 
			"            </h4>\r\n" + 
			"            <div class=\"{{../id}}-sample-request-param-body {{../id}}-sample-header-content-type-body hide\">\r\n" + 
			"              <div class=\"form-group\">\r\n" + 
			"                <div class=\"input-group\">\r\n" + 
			"                  <textarea id=\"sample-request-body-json\" class=\"form-control sample-request-body\" data-sample-request-body-group=\"sample-request-param-{{@./index}}\" rows=\"6\" style=\"OVERFLOW: visible\" {\r\n" + 
			"    {#if optional\r\n" + 
			"    }\r\n" + 
			"}data-sample-request-param-optional=\"true\"{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}></textarea>\r\n" + 
			"                  <div class=\"input-group-addon\">json</div>\r\n" + 
			"                </div>\r\n" + 
			"              </div>\r\n" + 
			"            </div>\r\n" + 
			"            <div class=\"{{../id}}-sample-request-param-fields {{../id}}-sample-header-content-type-fields\">\r\n" + 
			"              {\r\n" + 
			"    {#each this\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              <div class=\"form-group\">\r\n" + 
			"                <label class=\"col-md-3 control-label\" for=\"sample-request-param-field-{{field}}\">{\r\n" + 
			"    {field\r\n" + 
			"    }\r\n" + 
			"}</label>\r\n" + 
			"                <div class=\"input-group\">\r\n" + 
			"                  <input id=\"sample-request-param-field-{{field}}\" type=\"{{setInputType type}}\" placeholder=\"{{field}}\" class=\"form-control sample-request-param\" data-sample-request-param-name=\"{{field}}\" data-sample-request-param-group=\"sample-request-param-{{@../index}}\" {\r\n" + 
			"    {#if optional\r\n" + 
			"    }\r\n" + 
			"}data-sample-request-param-optional=\"true\"{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"                  <div class=\"input-group-addon\">{\r\n" + 
			"    {\r\n" + 
			"        {type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</div>\r\n" + 
			"                </div>\r\n" + 
			"              </div>\r\n" + 
			"              {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            </div>\r\n" + 
			"          {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"          <div class=\"form-group\">\r\n" + 
			"            <div class=\"controls pull-right\">\r\n" + 
			"              <button class=\"btn btn-primary sample-request-send\" data-sample-request-type=\"{{article.type}}\">{\r\n" + 
			"    {__ \"Send\"\r\n" + 
			"    }\r\n" + 
			"}</button>\r\n" + 
			"            </div>\r\n" + 
			"          </div>\r\n" + 
			"          <div class=\"form-group sample-request-response\" style=\"display: none;\">\r\n" + 
			"            <h3>\r\n" + 
			"              {\r\n" + 
			"    {__ \"Response\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              <button class=\"btn btn-default btn-xs pull-right sample-request-clear\">X</button>\r\n" + 
			"            </h3>\r\n" + 
			"            <pre data-type=\"json\"><code class=\"language-json sample-request-response-json\"></code></pre>\r\n" + 
			"          </div>\r\n" + 
			"        </fieldset>\r\n" + 
			"      </form>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-compare-article\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <article id=\"api-{{article.group}}-{{article.name}}-{{article.version}}\" {\r\n" + 
			"    {#if hidden\r\n" + 
			"    }\r\n" + 
			"}class=\"hide\"{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"} data-group=\"{{article.group}}\" data-name=\"{{article.name}}\" data-version=\"{{article.version}}\" data-compare-version=\"{{compare.version}}\">\r\n" + 
			"    <div class=\"pull-left\">\r\n" + 
			"      <h1>{\r\n" + 
			"    {underscoreToSpace article.group\r\n" + 
			"    }\r\n" + 
			"} - {\r\n" + 
			"    {\r\n" + 
			"        {showDiff article.title compare.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</h1>\r\n" + 
			"    </div>\r\n" + 
			"\r\n" + 
			"    <div class=\"pull-right\">\r\n" + 
			"      <div class=\"btn-group\">\r\n" + 
			"        <button class=\"btn btn-success\" disabled>\r\n" + 
			"          <strong>{\r\n" + 
			"    {article.version\r\n" + 
			"    }\r\n" + 
			"}</strong> {\r\n" + 
			"    {__ \"compared to\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </button>\r\n" + 
			"        <button class=\"version btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\">\r\n" + 
			"          <strong>{\r\n" + 
			"    {compare.version\r\n" + 
			"    }\r\n" + 
			"}</strong>&nbsp;<span class=\"caret\"></span>\r\n" + 
			"        </button>\r\n" + 
			"        <ul class=\"versions dropdown-menu open-left\">\r\n" + 
			"          <li class=\"disabled\"><a href=\"#\">{\r\n" + 
			"    {__ \"compare changes to:\"\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"          <li class=\"divider\"></li>\r\n" + 
			"        {\r\n" + 
			"    {#each versions\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <li class=\"version\"><a href=\"#\">{\r\n" + 
			"    {this\r\n" + 
			"    }\r\n" + 
			"}</a></li>\r\n" + 
			"        {\r\n" + 
			"    {/each\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </ul>\r\n" + 
			"      </div>\r\n" + 
			"    </div>\r\n" + 
			"    <div class=\"clearfix\"></div>\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if article.description\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p>{\r\n" + 
			"    {\r\n" + 
			"        {showDiff article.description compare.description \"nl2br\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</p>\r\n" + 
			"    {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if compare.description\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      <p>{\r\n" + 
			"    {\r\n" + 
			"        {showDiff \"\" compare.description \"nl2br\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</p>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    <pre data-type=\"{{toLowerCase article.type}}\"><code class=\"language-html\">{\r\n" + 
			"    {\r\n" + 
			"        {showDiff article.url compare.url\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-compare-permission\" article=article compare=compare\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    <ul class=\"nav nav-tabs nav-tabs-examples\">\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_title article.examples compare.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#compare-examples-{{../../article.id}}-{{index}}\">{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.title compare.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#compare-examples-{{../../article.id}}-{{index}}\"><ins>{\r\n" + 
			"    {\r\n" + 
			"        {source.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</ins></a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#compare-examples-{{../../article.id}}-{{index}}\"><del>{\r\n" + 
			"    {\r\n" + 
			"        {compare.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</del></a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    </ul>\r\n" + 
			"\r\n" + 
			"    <div class=\"tab-content\">\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_title article.examples compare.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{source.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.content compare.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{source.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {source.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{compare.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {compare.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    </div>\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-compare-param-block\" source=article.parameter compare=compare.parameter _hasType=_hasTypeInParameterFields section=\"parameter\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-compare-param-block\" source=article.success compare=compare.success _hasType=_hasTypeInSuccessFields section=\"success\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-compare-param-block\" source=article.error compare=compare.error _col1=\"Name\" _hasType=_hasTypeInErrorFields section=\"error\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {subTemplate \"article-sample-request\" article=article id=id\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"  </article>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article-compare-permission\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <p>\r\n" + 
			"  {\r\n" + 
			"    {__ \"Permission:\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {#each_compare_list_field article.permission compare.permission field=\"name\"\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#if source\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {source.name\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#if source.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{source.title}}\" data-content=\"{{nl2br source.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <ins>{\r\n" + 
			"    {source.name\r\n" + 
			"    }\r\n" + 
			"}</ins>\r\n" + 
			"        {\r\n" + 
			"    {#if source.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{source.title}}\" data-content=\"{{nl2br source.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <del>{\r\n" + 
			"    {source.name\r\n" + 
			"    }\r\n" + 
			"}</del>\r\n" + 
			"        {\r\n" + 
			"    {#if source.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{source.title}}\" data-content=\"{{nl2br source.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {compare.name\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {#if compare.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{compare.title}}\" data-content=\"{{nl2br compare.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <ins>{\r\n" + 
			"    {compare.name\r\n" + 
			"    }\r\n" + 
			"}</ins>\r\n" + 
			"        {\r\n" + 
			"    {#if compare.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{compare.title}}\" data-content=\"{{nl2br compare.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <del>{\r\n" + 
			"    {compare.name\r\n" + 
			"    }\r\n" + 
			"}</del>\r\n" + 
			"        {\r\n" + 
			"    {#if compare.title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <button type=\"button\" class=\"btn btn-info btn-xs\" data-title=\"{{compare.title}}\" data-content=\"{{nl2br compare.description}}\" data-html=\"true\" data-toggle=\"popover\" data-placement=\"right\" data-trigger=\"hover\">\r\n" + 
			"            <span class=\"glyphicon glyphicon-info-sign\" aria-hidden=\"true\"></span>\r\n" + 
			"          </button>\r\n" + 
			"          {\r\n" + 
			"    {#unless _last\r\n" + 
			"    }\r\n" + 
			"},\r\n" + 
			"{\r\n" + 
			"    {/unless\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {/each_compare_list_field\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </p>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article-compare-param-block\" type=\"text/x-handlebars-template\">\r\n" + 
			"  {\r\n" + 
			"    {#if source\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_keys source.fields compare.fields\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <h2>{\r\n" + 
			"    {__ source.key\r\n" + 
			"    }\r\n" + 
			"}</h2>\r\n" + 
			"        <table>\r\n" + 
			"        <thead>\r\n" + 
			"          <tr>\r\n" + 
			"            <th style=\"width: 30%\">{\r\n" + 
			"    {#if ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ \"Field\"\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"            {\r\n" + 
			"    {#if ../_hasType\r\n" + 
			"    }\r\n" + 
			"}<th style=\"width: 10%\">{\r\n" + 
			"    {__ \"Type\"\r\n" + 
			"    }\r\n" + 
			"}</th>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <th style=\"width: {{#if ../_hasType}}60%{{else}}70%{{/if}}\">{\r\n" + 
			"    {__ \"Description\"\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"          </tr>\r\n" + 
			"        </thead>\r\n" + 
			"        {\r\n" + 
			"    {subTemplate \"article-compare-param-block-body\" source=source.value compare=compare.value _hasType=../_hasType\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </table>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <h2><ins>{\r\n" + 
			"    {__ source.key\r\n" + 
			"    }\r\n" + 
			"}</ins></h2>\r\n" + 
			"        <table class=\"ins\">\r\n" + 
			"        <thead>\r\n" + 
			"          <tr>\r\n" + 
			"            <th style=\"width: 30%\">{\r\n" + 
			"    {#if ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ \"Field\"\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"            {\r\n" + 
			"    {#if ../_hasType\r\n" + 
			"    }\r\n" + 
			"}<th style=\"width: 10%\">{\r\n" + 
			"    {__ \"Type\"\r\n" + 
			"    }\r\n" + 
			"}</th>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <th style=\"width: {{#if ../_hasType}}60%{{else}}70%{{/if}}\">{\r\n" + 
			"    {__ \"Description\"\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"          </tr>\r\n" + 
			"        </thead>\r\n" + 
			"        {\r\n" + 
			"    {subTemplate \"article-compare-param-block-body\" source=source.value compare=source.value _hasType=../_hasType\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </table>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <h2><del>{\r\n" + 
			"    {__ compare.key\r\n" + 
			"    }\r\n" + 
			"}</del></h2>\r\n" + 
			"        <table class=\"del\">\r\n" + 
			"        <thead>\r\n" + 
			"          <tr>\r\n" + 
			"            <th style=\"width: 30%\">{\r\n" + 
			"    {#if ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ ../_col1\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {__ \"Field\"\r\n" + 
			"    }\r\n" + 
			"}{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"            {\r\n" + 
			"    {#if ../_hasType\r\n" + 
			"    }\r\n" + 
			"}<th style=\"width: 10%\">{\r\n" + 
			"    {__ \"Type\"\r\n" + 
			"    }\r\n" + 
			"}</th>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            <th style=\"width: {{#if ../_hasType}}60%{{else}}70%{{/if}}\">{\r\n" + 
			"    {__ \"Description\"\r\n" + 
			"    }\r\n" + 
			"}</th>\r\n" + 
			"          </tr>\r\n" + 
			"        </thead>\r\n" + 
			"        {\r\n" + 
			"    {subTemplate \"article-compare-param-block-body\" source=compare.value compare=compare.value _hasType=../_hasType\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        </table>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_keys\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {#if source.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    <ul class=\"nav nav-tabs nav-tabs-examples\">\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_title source.examples compare.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\">{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.title compare.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\"><ins>{\r\n" + 
			"    {\r\n" + 
			"        {source.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</ins></a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <li{\r\n" + 
			"    {#if_eq index compare=0\r\n" + 
			"    }\r\n" + 
			"} class=\"active\"{\r\n" + 
			"    {/if_eq\r\n" + 
			"    }\r\n" + 
			"}>\r\n" + 
			"          <a href=\"#{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\"><del>{\r\n" + 
			"    {\r\n" + 
			"        {compare.title\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</del></a>\r\n" + 
			"        </li>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    </ul>\r\n" + 
			"\r\n" + 
			"    <div class=\"tab-content\">\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_title source.examples compare.examples\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{source.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.content compare.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{source.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {source.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <div class=\"tab-pane{{#if_eq index compare=0}} active{{/if_eq}}\" id=\"{{../../section}}-compare-examples-{{../../article.id}}-{{index}}\">\r\n" + 
			"          <pre data-type=\"{{compare.type}}\"><code class=\"language-{{source.type}}\">{\r\n" + 
			"    {\r\n" + 
			"        {compare.content\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code></pre>\r\n" + 
			"        </div>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_title\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"    </div>\r\n" + 
			"    {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<script id=\"template-article-compare-param-block-body\" type=\"text/x-handlebars-template\">\r\n" + 
			"  <tbody>\r\n" + 
			"    {\r\n" + 
			"    {#each_compare_field source compare\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"      {\r\n" + 
			"    {#if typeSame\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <tr>\r\n" + 
			"          <td class=\"code\">\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {splitFill source.field \".\" \"&nbsp;&nbsp;\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if source.optional\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              {\r\n" + 
			"    {#if compare.optional\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"              {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional label-ins\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>\r\n" + 
			"              {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"              {\r\n" + 
			"    {#if compare.optional\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional label-del\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"\r\n" + 
			"        {\r\n" + 
			"    {#if source.type\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {#if compare.type\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.type compare.type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"          {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>{\r\n" + 
			"    {\r\n" + 
			"        {source.type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"          {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {#if compare.type\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>{\r\n" + 
			"    {\r\n" + 
			"        {compare.type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"          {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if ../../../../_hasType\r\n" + 
			"    }\r\n" + 
			"}<td></td>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.description compare.description \"nl2br\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if source.defaultValue\r\n" + 
			"    }\r\n" + 
			"}<p class=\"default-value\">{\r\n" + 
			"    {__ \"Default value:\"\r\n" + 
			"    }\r\n" + 
			"} <code>{\r\n" + 
			"    {\r\n" + 
			"        {showDiff source.defaultValue compare.defaultValue\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code><p>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"        </tr>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeIns\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <tr class=\"ins\">\r\n" + 
			"          <td class=\"code\">\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {splitFill source.field \".\" \"&nbsp;&nbsp;\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if source.optional\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional label-ins\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"\r\n" + 
			"        {\r\n" + 
			"    {#if source.type\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>{\r\n" + 
			"    {\r\n" + 
			"        {source.type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"        {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {\r\n" + 
			"        {typRowTd\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"          <td>\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {nl2br source.description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if source.defaultValue\r\n" + 
			"    }\r\n" + 
			"}<p class=\"default-value\">{\r\n" + 
			"    {__ \"Default value:\"\r\n" + 
			"    }\r\n" + 
			"} <code>{\r\n" + 
			"    {\r\n" + 
			"        {source.defaultValue\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code><p>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"        </tr>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"      {\r\n" + 
			"    {#if typeDel\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        <tr class=\"del\">\r\n" + 
			"          <td class=\"code\">\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {splitFill compare.field \".\" \"&nbsp;&nbsp;\"\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if compare.optional\r\n" + 
			"    }\r\n" + 
			"} <span class=\"label label-optional label-del\">{\r\n" + 
			"    {__ \"optional\"\r\n" + 
			"    }\r\n" + 
			"}</span>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"\r\n" + 
			"        {\r\n" + 
			"    {#if compare.type\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          <td>{\r\n" + 
			"    {\r\n" + 
			"        {compare.type\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</td>\r\n" + 
			"        {\r\n" + 
			"    {else\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          {\r\n" + 
			"    {\r\n" + 
			"        {typRowTd\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"        {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"          <td>\r\n" + 
			"            {\r\n" + 
			"    {\r\n" + 
			"        {nl2br compare.description\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"            {\r\n" + 
			"    {#if compare.defaultValue\r\n" + 
			"    }\r\n" + 
			"}<p class=\"default-value\">{\r\n" + 
			"    {__ \"Default value:\"\r\n" + 
			"    }\r\n" + 
			"} <code>{\r\n" + 
			"    {\r\n" + 
			"        {compare.defaultValue\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}</code><p>{\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"          </td>\r\n" + 
			"        </tr>\r\n" + 
			"      {\r\n" + 
			"    {/if\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"    {\r\n" + 
			"    {/each_compare_field\r\n" + 
			"    }\r\n" + 
			"}\r\n" + 
			"  </tbody>\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"<div class=\"container-fluid\">\r\n" + 
			"  <div class=\"row\">\r\n" + 
			"    <div id=\"sidenav\" class=\"span2\"></div>\r\n" + 
			"    <div id=\"content\">\r\n" + 
			"      <div id=\"project\"></div>\r\n" + 
			"      <div id=\"header\"></div>\r\n" + 
			"      <div id=\"sections\"></div>\r\n" + 
			"      <div id=\"footer\"></div>\r\n" + 
			"      <div id=\"generator\"></div>\r\n" + 
			"    </div>\r\n" + 
			"  </div>\r\n" + 
			"</div>\r\n" + 
			"\r\n" + 
			"<div id=\"loader\">\r\n" + 
			"  <div class=\"spinner\">\r\n" + 
			"    <div class=\"spinner-container container1\">\r\n" + 
			"      <div class=\"circle1\"></div><div class=\"circle2\"></div><div class=\"circle3\"></div><div class=\"circle4\"></div>\r\n" + 
			"    </div>\r\n" + 
			"    <div class=\"spinner-container container2\">\r\n" + 
			"      <div class=\"circle1\"></div><div class=\"circle2\"></div><div class=\"circle3\"></div><div class=\"circle4\"></div>\r\n" + 
			"    </div>\r\n" + 
			"    <div class=\"spinner-container container3\">\r\n" + 
			"      <div class=\"circle1\"></div><div class=\"circle2\"></div><div class=\"circle3\"></div><div class=\"circle4\"></div>\r\n" + 
			"    </div>\r\n" + 
			"    <p>Loading...</p>\r\n" + 
			"  </div>\r\n" + 
			"</div>\r\n" + 
			"\r\n" + 
			"<script data-main=\"main.js\" src=\"vendor/require.min.js\"></script>\r\n" + 
			"</body>\r\n" + 
			"</html>\r\n" +"";

	RequestSpecification httpRequest= RestAssured.given();
	 Response res = httpRequest.body(payload).post("https://restful-booker.herokuapp.com/booking/:id");
	 
	 int statuscode = res.getStatusCode();
	 	System.out.println("Status Code: " + statuscode);
	 
	 
	}
}
