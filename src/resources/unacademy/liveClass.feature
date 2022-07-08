@LiveClass
Feature: LiveClass_feature
 
#Background: precondition
#	When User is on homepage of Unacademy application
#	When user clicks on view all live classes on home page of Unacademy
#	When user clicks on a live class on Unacademy
#	Then live class should open on Unacademy

@Test_volume
Scenario: Volume

When user clicks on mute 
Then mute should toggle

When user slides the volume slider 
Then volume should mirror the actions

@Test_time
Scenario: Time

When user clicks on rewind button 
Then Go live button should be clickable
When user clicks on go live button user should be synced up with the teacher

When user clicks on rewind button 
Then video should go back ten seconds

When user clicks on forward button
Then video should go forward ten seconds

When user clicks on pause button
Then video should pause

@Test_right_panel
Scenario: Right side Panel

 When user clicks on Raise Hand icon
 And user clicks on Raise Hand button
 Then user should get a message that they need to be subscribed
 
 @Test_panel
 Scenario: Panel
 When user clicks on hide panel button
 Then panel should be toggled shown|not shown
 
 @Unsuccessful_doubt
Scenario: Unsuccessful_doubt
When user clicks on Ask doubts button
 And user clicks on comment box 
 And message is shorter than thirty characters
 |hi|
 |I have a  doubt| 
 Then user should get a message saying that minimum thirty characters are needed
 
 @successful_doubt
 Scenario: Succesfull_doubt
 When user clicks on Ask doubts button
 And user clicks on comment box 
 And types their doubt and sends it
 |this is a vaild doubt since it is longer than 30 characters| 
 Then their doubt should be sent
 
 When user clicks on Ask doubts button
 And user clicks on attach image 			
 # TODO
 Then user should be able to attach an image and send it
 #Then a message should be displayed saying you need to be subscribed
 
 
 @Test_chat
 Scenario: Chat
 
 When user clicks on Chat button 
 And user types a message and send it
 |hi chat|
 Then their message should be sent
 
 When user clicks on someone's profile 
 Then their details should be displayed
 
 When user clicks on Emojis 
 Then they should be sent in chat
 
 When user clicks on multiple emojis
 Then they should be sent in chat
 
 When user scrolls up in chat
 Then a Jump to latest button should appear
 
 @Test_settings
 Scenario: Settings
 
 When user clicks on settings 
 And user clicks on dark theme
 Then dark theme should toggle
 
 #When user clicks on settings 
 And user clicks on educator video
 Then educator video should toggle
 
 #When user clicks on settings 
 And user clicks on report an issue
 And user selects image 
 And user types text
 |I have an issue to report|
 And user selects predefined issues
 Then their report should be sent
 
 @Test_shortcuts
 Scenario: Keyboard shortcuts
 
 When user presses M on keyboard
 Then mute should be toggled_shortcuts
 
 When user presses D on keyboard
 Then doubt panel should open_shortcuts
 
 When user presses T on keyboard
 Then chat box should be shown_shortcuts
 
 When user presses G on keyboard
 Then Raise hand panel should open_shortcuts
 
 When user presses Space bar on keyboard
 Then video should pause_shortcuts
 
 When user presses Esc on keyboard while in fullscreen mode
 Then Fullscreen should be exited_shortcuts
 
 @Test_others
 Scenario: Others
 
 When user clicks fullscreen button
 When user clicks on exit fullscreen button
 
 @Test_Feedback
 Scenario: Give_feedback
 
 When user presses back button
 Then user should goto feedback page
 When user clicks on an emoji_feedback
 Then user should be able to type their feedback 
 And user should be able to select predefined feedbacks
 Then user should be able to submit feedback
  
 
 
 
 #Poll
 # When educator does a poll user should be able to select options and Close poll
 # After the poll expires result should be shown
 

