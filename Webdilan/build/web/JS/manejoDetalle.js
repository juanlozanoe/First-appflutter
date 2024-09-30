/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function showProductDetail(name, price, description, image) {
    // Actualizar el contenido de la carta de detalle
    document.getElementById('detailProductName').textContent = name;
    document.getElementById('detailProductPrice').textContent = price;
    document.getElementById('detailProductDescription').textContent = description;
    document.getElementById('detailProductImage').src = image;

    // Mostrar la carta de detalle y el overlay
    document.getElementById('productDetailCard').style.display = 'block';
    document.getElementById('overlay').style.display = 'block';
}

document.getElementById('closeDetailCard').addEventListener('click', function () {
    // Ocultar la carta de detalle y el overlay
    document.getElementById('productDetailCard').style.display = 'none';
    document.getElementById('overlay').style.display = 'none';
});

document.getElementById('overlay').addEventListener('click', function () {
    // Ocultar la carta de detalle y el overlay si se hace clic en el overlay
    document.getElementById('productDetailCard').style.display = 'none';
    document.getElementById('overlay').style.display = 'none';
});
