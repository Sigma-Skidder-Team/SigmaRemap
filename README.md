# SigmaRemap
Sigma 5.0 (1.15.2) remapping project

### Thanks
- This entire project could only be possible by the help of **@kitten_12333** himself who deobfuscated sigma 5.0 to be readable enough.

### [!] TO-DO
1. Make the remap runnable;

### Contributors
- Currently none;

### How to make a runnable jar for the minecraft launcher?
1. Clone this repo and open it in intellij;
2. Set up the project (libraries, natives);
3. Open the project structure with ``Ctrl + Alt + Shift + S``;
4. Find and click on the ``Artifacts`` tab;
5. Press ``+`` -> ``JAR`` -> ``Empty``;
6. In the ``Available Elements`` tab, right-click on ``Libraries`` -> ``Extract into Output Root``;
7. In the same tab, right-click on your ``compile output`` icon -> ``Put into Output Root``
8. Give your artifact a name (optional);
9. Close the project structure window and find the ``Build`` tab -> ``Build artifacts`` and double-click on your created artifact;
10. This jar will be then compiled in your project's directory``/out/artifacts/artifact name/artifact name.jar``

### Images
- Currently none;

### Tools & stuff used
- Java Decompiler - https://java-decompiler.github.io/
- Optifine 1.15.2 HD U G1 pre30 source - https://github.com/Hexeption/Optifine-SRC
- Recaf 4.0.0-SNAPSHOT - https://github.com/Col-E/Recaf-Launcher
