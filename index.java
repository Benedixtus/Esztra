// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyAasHnbKK2q-pk7HlXZMKNEtlso7y5khCE",
  authDomain: "esztra-atombunker.firebaseapp.com",
  projectId: "esztra-atombunker",
  storageBucket: "esztra-atombunker.appspot.com",
  messagingSenderId: "553637384316",
  appId: "1:553637384316:web:6661f5cd388c2434a9f9f9",
  measurementId: "G-QHZ3PL237T"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);