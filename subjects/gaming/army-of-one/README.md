## ArmyOfOne

In this exercise, you will learn to create a complex player movement from scratch. The character you will use is Countess from the game Paragon. She's nice after you know her, just give her a chance.

### Objectives

For this project you will implement a fully playable character using what we call Animation Blueprint, Aim Offset and Player Character Blueprint.

### Instructions

Starting from an empty project, after creating a level with a floor (nothing else is really required), you should:

- Create a Third Player Character Blueprint and apply the Countess mesh to it.

  - Give the character the ability to:

    - Move forward, backward, left and right using the WASD keys.
    - Look around and change direction using the mouse.
    - Jump using Space.
    - Attack using the left mouse click.

- Create an animation blueprint file to animate the character, so she can be animated while running, jumping, attacking, etc...

- Implement the Aim Offset or a Control Rig, so that when the player moves the mouse, the head of Countess follow the direction we’re looking at, in a 180-degree angle.

- Separate the upper and lower body part, so that the character is able to walk and attack at the same time without any animation problems.

- Make Countess lean according to the mouse direction, while running forward.

- Use Animation Blend Spaces to organize your movements.

- Use Animation Blueprint variables to handle different animation states.

After downloading and unzipping this [file](https://assets.01-edu.org/Unreal-Engine-Piscine/ArmyOfOne.zip), you can copy its content to your project Content folder.

When finished, your project should look like the [“Expected Result” video](https://youtu.be/sebi5icA1MM).

> Do not forget to zip up the project compile and save everything for peer correction.
> If it is not possible to upload files to Gitea due to their size, use GitHub instead and have a look at [Git LSF](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github)

[Here](https://www.youtube.com/playlist?list=PLHyAJ_GrRtf9sxZqgfPVM06PrLk8_CWA-) you can find an instructional playlist on Unreal Engine.
