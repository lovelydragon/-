import Data from './data.js'


let data = new Data();

let ctx = canvas.getContext('2d')
var score = 0;
const test = 'images/bgm.jpg';
const screenWidth = window.innerWidth
const screenHeight = window.innerHeight
// let data = new data();

export default class Main {
  constructor() {
    console.log(data.type[0].name)
   
    canvas.addEventListener('touchstart', ((e) => {
      e.preventDefault()
      // this.blindText()
      this.renderGameScore(++score)
      let x = e.touches[0].clientX
      let y = e.touches[0].clientY
      //
      

    }).bind(this))
  }
  renderGameScore( score) {
    let img = wx.createImage()
    img.src = test
    ctx.drawImage(
      img, 0, 0, screenWidth, screenHeight, 0, 0, screenWidth, screenHeight
    )
    ctx.fillStyle = "#000000"
    ctx.font = "20px Arial"

    ctx.fillText(
      score,
      10,
      30
    )
   this.blindText();
  }
  degToRad(degrees){
    return degrees * Math.PI / 180;
  }
  
  blindText(){
    ctx.fillStyle = "#000000"
    ctx.font = "20px Arial"

    ctx.fillText(
      "text",
      10,
      30
    )
  }
}

