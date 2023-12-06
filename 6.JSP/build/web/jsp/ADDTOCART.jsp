
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,com.*" %>
<%
    int productId=  Integer.parseInt(request.getParameter("id"));

    ArrayList<Product> product=new ArrayList<>();
    product.add(new Product(1,"Product 1",10));
    product.add(new Product(2,"Product 2",20));
    product.add(new Product(3,"Product 3",30));

    CartItem cartItem=null;
    for(Product products:product)
    {
        if(products.getId()==productId)
        {
            cartItem=new  CartItem(products,1);
            break;
        }
    }

    if(cartItem!=null)
    {
        ArrayList<CartItem> cart=   (ArryList<CartItem>) session.getAttribute("cart");
        if(cart==null)
        {
            cart=new Arraylist<>();
            session.setAttribute("cart",cart);
        }
        cart.add(cartItem);
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Added to Cart</title>
    </head>
    <body>
        <h1>Added to Cart</h1>
        <p><a href="Product.jsp">Continue Shopping</a></p>
    </body>
</html>
