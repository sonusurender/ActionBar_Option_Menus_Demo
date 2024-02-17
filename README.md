# ActionBar and Option Menus
**What is the action bar?**
<br>
The action bar (ActionBar) is located at the top of the activity. It can display the activity title, icon, actions which can be triggered, additional views and other interactive items. It can also be used for navigation in your application.

The action bar is enabled for devices which specify a target SDK of API version 11 or higher. It is possible to disable the action bar via the used theme, but the default Android themes have it enabled.

Applications with a target SDK version less than API 11 use the options menu if such a button is present on the device. The option menu is displayed if the user presses the Option button. The action bar is superior to the options menu, as the action bar is clearly visible, while the options menu is only shown on request. In case of the options menu, the user may not recognize that options are available in the application.

**What is the option menus?**
<br>
Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc.

We inflate the menu by calling the **inflate()** method of MenuInflater class. To perform event handling on menu items, you need to override **onOptionsItemSelected()** method of Activity class.

**Note:  Both actionbar and option menus can be customized.**

For detailed explanation of code, [visit here](http://www.androhub.com/android-actionbar-and-option-menus/).

# Video Demo
👉 Watch it <a href="https://youtu.be/qHVGFSUOxec">here</a>.
<br>

[![Watch demo](http://i3.ytimg.com/vi/qHVGFSUOxec/hqdefault.jpg)](https://youtu.be/qHVGFSUOxec)

# Connect with Us
- <a href="https://www.youtube.com/channel/@Androhub" target="_blank">`Youtube`</a>
- <a href="https://www.facebook.com/androhubtutorial/" target="_blank">`Facebook`</a>
- <a href="https://www.instagram.com/androhub_tutorial" target="_blank">`Instagram`</a>
- <a href="https://www.linkedin.com/in/surender-kumar-681472a8?originalSubdomain=in" target="_blank">`LinkedIn `</a>
- <a href="https://twitter.com/sonusurender0/" target="_blank">`Twitter`</a>
- <a href="http://www.androhub.com/" target="_blank">`Website`</a>

# Support
Reach out to me at surender@androhub.com.

# Buy Me a Coffee
Donate for the free content.

<a href="https://www.buymeacoffee.com/androhub" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>
