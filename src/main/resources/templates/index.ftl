<html>
    <head>
        <meta charset="UTF-8">
        <#-- static、templates、public自动映射到 /  无需写目录名称-->
    </head>
    <body>
        <#--<#list poetris?poet as key>-->
            <#--<li>诗人：${key}</li>-->
                <#--<#list ${poetris[key]}?title as key>-->
                    <#--<li>${title}</li>-->
                     <#--<li>${${poetris[key]}[key]}</li>-->
                    <#--<li>-------------------------------------------------------------------</li>-->
                <#--</#list>-->
        <#--</#list>-->
        <#--<#list poetris.keySet() as strKey>-->
            <#--　<li>${strKey}</li>-->
        <#--</#list>-->

        <#list poetris?keys as poet>
                <li>${poet}</li>
                <#list poetris[poet]?keys as poetry>
                <p align="center">${poetry}</p>
                <p align="center">${(poetris[poet])[poetry]}</p>
                </#list>
        </#list>

        <p>
            <span style="float: left;">
                <a href="/poem/?pageNumber=${previousPage}" title="上一页" >上一页</a>
            </span>
            <span style="float: right;">
                <a href="/poem/?pageNumber=${nextPage}" title="下一页" >下一页</a>
            </span>
        </p>



                <#--<#list naviMap[naviKey]?keys as checkedKey>-->
                <#--<input type="checkbox" checked name="moduleName" value="${checkedKey}">-->
                <#--${(naviMap[naviKey])[checkedKey]}-->
                <#--</#list>-->

                <#--</#list>-->

    </body>
</html>