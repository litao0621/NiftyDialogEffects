NiftyDialogEffects
==================
NiftyDialogEffects is deprecated

Nifty Modal Dialog Effects look like this([Nifty Modal Window Effects][1])

[![Android Arsenal](http://img.shields.io/badge/%20%20%20Android%20Arsenal%20%20%20-%20%20%20NiftyDialogEffects%20%20%20-blue.svg)](http://android-arsenal.com/details/1/772)
[![Build Status](https://travis-ci.org/sd6352051/NiftyDialogEffects.svg?branch=master)](https://travis-ci.org/sd6352051/NiftyDialogEffects)
[![JitPack Maven](https://img.shields.io/github/tag/sd6352051/NiftyDialogEffects.svg?label=JitPack%20Maven)](https://jitpack.io/#sd6352051/NiftyDialogEffects)

# ScreenShot

![Image][2]
.
![Image][3]
.
![Image][4]
.
![Image][5]

# Gradle

```groovy
dependencies {
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'com.github.sd6352051.niftydialogeffects:niftydialogeffects:1.0.0@aar'
}
```

Or using [JitPack](https://jitpack.io/#sd6352051/NiftyDialogEffects):

```gradle
repositories { 
    maven { url "https://jitpack.io" }
}
dependencies {
    compile 'com.github.sd6352051:NiftyDialogEffects:1.0.0'
}
```

# Eclipse

Download  [nineoldandroids-2.4.0.jar](https://github.com/downloads/JakeWharton/NineOldAndroids/nineoldandroids-2.4.0.jar) into your libs directory.

# Usage
``` java
NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(this);

dialogBuilder
    .withTitle("Modal Dialog")
    .withMessage("This is a modal Dialog.")
    .show();
```


# Configuration
``` java
dialogBuilder
    .withTitle("Modal Dialog")                                  //.withTitle(null)  no title
    .withTitleColor("#FFFFFF")                                  //def
    .withDividerColor("#11000000")                              //def
    .withMessage("This is a modal Dialog.")                     //.withMessage(null)  no Msg
    .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
    .withDialogColor("#FFE74C3C")                               //def  | withDialogColor(int resid)
    .withIcon(getResources().getDrawable(R.drawable.icon))
    .withDuration(700)                                          //def
    .withEffect(effect)                                         //def Effectstype.Slidetop
    .withButton1Text("OK")                                      //def gone
    .withButton2Text("Cancel")                                  //def gone
    .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
    .setCustomView(R.layout.custom_view,v.getContext())         //.setCustomView(View or ResId,context)
    .setButton1Click(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "i'm btn1", Toast.LENGTH_SHORT).show();
                    }
    })
    .setButton2Click(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"i'm btn2",Toast.LENGTH_SHORT).show();
        }
    })
    .show();
```
# Effects
`Fadein`, `Slideleft`, `Slidetop`, `SlideBottom`, `Slideright`, `Fall`, `Newspager`, `Fliph`, `Flipv`, `RotateBottom`, `RotateLeft`, `Slit`, `Shake`, `Sidefill`

([See The Effect][1])

# Developed By

* 李涛-Li Tao - <onresume@live.com> 
* 欢迎提供一个工作机会给我

# License
Copyright 2014 litao.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.








[1]: http://tympanus.net/Development/ModalWindowEffects/
[2]: http://img2.ph.126.net/MQFh_6FkTAD1qqzZ7EVdow==/2561703763061757743.png
[3]: http://img2.ph.126.net/uHM9MmUmlJk8moJlVyNTmw==/2568459162502797428.png
[4]: http://img1.ph.126.net/g2fw5Z1OtPBgE0cbn-HBqw==/6608233108214335942.png
[5]: http://img0.ph.126.net/iC46e1bXkU1f1rIfUZo99w==/6597620621984019408.gif

by cncounter 
