/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


document.addEventListener("DOMContentLoaded", function() {
    const prevButton = document.querySelector(".carousel-button.prev");
    const nextButton = document.querySelector(".carousel-button.next");
    const carouselInner = document.querySelector(".carousel-inner");
    let currentIndex = 0;

    function showSlide(index) {
        const slides = document.querySelectorAll(".carousel-item");
        const totalSlides = slides.length;
        if (index >= totalSlides) index = 0;
        if (index < 0) index = totalSlides - 1;
        const offset = -index * 100;
        carouselInner.style.transform = `translateX(${offset}%)`;
        currentIndex = index;
    }

    prevButton.addEventListener("click", function() {
        showSlide(currentIndex - 1);
    });

    nextButton.addEventListener("click", function() {
        showSlide(currentIndex + 1);
    });

    showSlide(currentIndex);
});
