# Gingerbread Factory (NeoForge 1.21.1)

Adds a multi-step gingerbread chain made of normal crafting/smelting recipes,
so vanilla Crafters, hoppers, furnaces/smokers (and Pipez) can automate it.

1. Gingerbread Spice: 2 cocoa beans + sugar + brown mushroom -> 4
2. Gingerbread Dough: 3 wheat + egg + sugar + spice -> 4
3. Raw Gingerbread Man: 6 dough in a person shape (" D ", "DDD", "D D") -> 3
4. Gingerbread Man: smelt/smoke the raw man
5. Royal Icing: 2 sugar + egg + snowball -> 4
6. Frosted Gingerbread Man: gingerbread man + icing
7. Gingerbread House (block): "FFF","FIF","FFF" (F = frosted man, I = icing)

## Build with GitHub (no installs)
1. Create a free GitHub repo and upload everything in this folder (including the hidden .github folder).
2. Open the Actions tab, run "Build mod" (or it runs on upload).
3. Download the "gingerbreadfactory-jar" artifact, unzip it, and put the .jar in your mods folder.

## Build locally
Install Java 21 and Gradle 8.10+, then run `gradle build`. The jar is in build/libs/.
