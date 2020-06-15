

mobilenet;
video;
label ='';


function modelReady() {
	console.log('Model is ready!!!');
	mobilenet.predict(gotResults);
}

function gotResults(error, results) {
	if (error) {
		console.log(error);
	}else{
		//console.log(results);
		label = results[0].label;
		prob = results[0].confidence;
		mobilenet.predict(gotResults);
	}
	
}

/*function imageLoaded() {
	image(video,0,0,width,height);
	console.log('Image loaded!');
}*/

function setup() {
	createCanvas(640, 550);
	console.log('ml5 version:', ml5.version); 
	video = createCapture(VIDEO);
	video.hide();
	background(120,5,3);
	mobilenet = ml5.imageClassifier('MobileNet', video, modelReady);

}

function draw(){
	background(0);
	image(video,0,0);
	fill(255);
	textSize(32);
	text(label,10,height-20);	 
}


