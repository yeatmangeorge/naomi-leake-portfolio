document.querySelectorAll(".slideshow").forEach(slideshow => {
  const images = slideshow.querySelectorAll(".slideshow-image");

  if (images.length < 2) return;

  let current = 0;

  setInterval(() => {
    images[current].classList.remove("active");
    current = (current + 1) % images.length;
    images[current].classList.add("active");
  }, 4000);
});