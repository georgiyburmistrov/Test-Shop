<!DOCTYPE html>
<html>
<head>
    <title>TESTSHOP</title>
</head>
<body>
<h1>TestSHOP</h1><hr>
<h4>Товары со всей России</h4>
<form>
    Поиск товара: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Создать новое объявление</h3>
<form action="/product/create" method="post">
    Название товара: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/> руб.<br><br>
    Город: <input type="text" name="city"/><br><br>
    Продавец: <input type="text" name="salesman"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>