importScripts("https://www.gstatic.com/firebasejs/8.2.4/firebase-app.js");
importScripts("https://www.gstatic.com/firebasejs/8.2.4/firebase-messaging.js");
const firebaseConfig = {
    apiKey: "AIzaSyAHndzYUhnD1MlEUj5R10mXxwRJPLf2dEs",
    authDomain: "push-bds-1b66f.firebaseapp.com",
    projectId: "push-bds-1b66f",
    storageBucket: "push-bds-1b66f.appspot.com",
    messagingSenderId: "527637616111",
    appId: "1:527637616111:web:94382e5ab802b295f5921a"
};
firebase.initializeApp(firebaseConfig);
const messaging = firebase.messaging();
messaging.setBackgroundMessageHandler(function(payload) {     
     console.log("sw bg message event: ", payload);
});