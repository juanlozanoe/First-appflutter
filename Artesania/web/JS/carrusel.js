/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


let currentIndex = 0;
const carousel = document.querySelector('.carousel');
const totalCards = document.querySelectorAll('.carousel-card').length;

function moveCarousel(direction) {
    currentIndex = (currentIndex + direction + totalCards) % totalCards; 
    const moveX = currentIndex * (100 / 3); 
    carousel.style.transform = `translateX(-${moveX}%)`;
}

let autoSlide = setInterval(() => moveCarousel(1), 2000);

document.querySelectorAll('.carousel-button').forEach(button => {
    button.addEventListener('click', () => {
        clearInterval(autoSlide); 
        moveCarousel(button.classList.contains('next') ? 1 : -1);
        autoSlide = setInterval(() => moveCarousel(1), 2000);
    });
});
