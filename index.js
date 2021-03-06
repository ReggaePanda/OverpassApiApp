import { Navigation } from "react-native-navigation";

import { registerScreens } from "./src/screens";

registerScreens(); // this is where you register all of your app's screens

// start the app
Navigation.startSingleScreenApp({
  screen: {
    screen: "overpass.Map", // unique ID registered with Navigation.registerScreen
    title: "Map", // title of the screen as appears in the nav bar (optional)
    navigatorStyle: {
      navBarHidden: true
    }, // override the navigator style for the screen, see "Styling the navigator" below (optional)
    navigatorButtons: {} // override the nav buttons for the screen, see "Adding buttons to the navigator" below (optional)
  },
  drawer: {
    left: {
      screen: "overpass.SideMenu"
    },

    right: {
      screen: "overpass.MarkerDetails"
    }
  }
});
