// from https://github.com/Icenium/sample-media-player
document.addEventListener("deviceready", onDeviceReady, false);
//Fix :active state on device
document.addEventListener("touchstart", function() {}, false);

var mediaPlayer;

function onDeviceReady() {
    navigator.splashscreen.hide();
	mediaPlayer = new MediaPlayer();
	mediaPlayer.run();
}

function MediaPlayer() {
}

MediaPlayer.prototype = {
	mediaContent : null,
	isPlaying : false,
    
	run: function() {
		var that = this,
            src = "C:/Users/James/Music/bbs.mp3"; //needs to be changed to the in app location
		    
        
		var playAudioButton = document.getElementById("buttonPlayAudio"),
    		stopAudioButton = document.getElementById("buttonStopAudio"),
    		pauseAudioButton = document.getElementById("buttonPauseAudio");
           
                                
		playAudioButton.addEventListener("click",
										 function() {
											 that._play.apply(that, arguments)
										 }); 
		
		stopAudioButton.addEventListener("click", 
										 function() {
											 that._stop.apply(that, arguments) 
										 });
		
		pauseAudioButton.addEventListener("click", 
										  function() {
											  that._pause.apply(that, arguments)
										  });

        
		that.mediaContent = new Media(src, 
									  function() {
										  that._onMediaSuccess.apply(that, arguments);
									  },
									  function() {
										  that._onError.apply(that, arguments);
									  },
                                      function() {
                                          that._onMediaStatusChanged.apply(that, arguments);
                                      });
	},
    
	_onMediaSuccess: function() {
		console.log("mediaSuccess");
	},
    
	_onError: function(error) {
		var errorMessage = "code: " + error.code + "\n" +
						   "message: " + error.message + "\n";
		this._showMessage(errorMessage);
        this.isPlaying = false;
	},
    
    _onMediaStatusChanged: function(status) {
        if(status === Media.MEDIA_STOPPED) {
            this.mediaContent.release();
        }  
    },
    
  /*  _loop: function () {
        if (document.getElementById("60").selected = "true") {
            this._showMessage('something');
            /* 
                if (status === this.MEDIA_STOPPED) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                };
                this._showMessage('looping' + i);
                i++;
            }
            
        }
    }, */



    _play: function () {
        //var i = 0;

       
        //default
        if (document.getElementById("blank").selected) {
            //nothing happens sop that they can't play the music without having chosen a looptime first
        }

        //for 15minutes
        if (document.getElementById("15").selected) {

            for (i = 0; i < 15; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing...');
                    this.isPlaying = true;
                }
            }
        }
            //for 30 minutes
        if (document.getElementById("30").selected) {
            for (i = 0; i < 30; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing30...');
                    this.isPlaying = true;
                }
                }
            }

            //for 45 minutes
        if (document.getElementById("45").selected){ 
            for (i = 0; i < 45; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing40...');
                    this.isPlaying = true;
                }
                }
            }

            //For 60mn loop
        if (document.getElementById("60").selected) {
            for (i = 0; i < 60; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing60...');
                    this.isPlaying = true;
                }
            }
        }

            //for 90minutes
        if (document.getElementById("90").selected) {
            for (i = 0; i < 90; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing90...');
                    this.isPlaying = true;
                }
            }
        }

            //for 120 minutes
        if (document.getElementById("120").selected) {
            for (i = 0; i < 120; i++) {
                if (this.isPlaying === false) {
                    this.mediaContent.play({ playAudioWhenScreenIsLocked: true });
                    this._showMessage('Playing120...');
                    this.isPlaying = true;
                }
            }
        }
	},
    
	_pause: function () {
		if(this.isPlaying === true) {
            this.mediaContent.pause();
    		this._showMessage('Paused');
            this.isPlaying = false;
        }
	},
    
	_stop: function () {
        this.mediaContent.stop();
		this._showMessage('');
		this.isPlaying = false;
	},

	
    
	_showMessage: function(text) {
		var statusBox = document.getElementById('result');
		statusBox.innerText = text;
	}

    // Set audio position
    
/*function setAudioPosition(position) {
    document.getElementById('audio_position').innerHTML = position;
}*/

}