NiftyDialogEffects
==================

Nifty Modal Dialog Effects look like this([Nifty Modal Window Effects][1])


# ScreenShot

![Image][2]
.
![Image][3]
.
![Image][4]


# Quick start
``` java
NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(this);

dialogBuilder
    .withTitle("Modal Dialog")
    .withMessage("This is a modal Dialog.")
    .show();
```


# Config
``` java
dialogBuilder
    .withTitle("Modal Dialog")
    .withTitleColor("#FFFFFF")
    .withDividerColor("#11000000")
    .withMessage("This is a modal Dialog.")
    .withMessageColor("#FFFFFF")
    .withIcon(getResources().getDrawable(R.drawable.icon))
    .withEffect(effect)
    .withButton1Text("OK")
    .withButton2Text("Cancel")
    .setCustomView(viewresId,context)
    .setButton1Click(new View.OnClickListener() {
         @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"i'm btn1",Toast.LENGTH_SHORT).show();
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
![Image][5]
([See The Effect][1])











[1]: http://tympanus.net/Development/ModalWindowEffects/
[2]: http://img2.ph.126.net/MQFh_6FkTAD1qqzZ7EVdow==/2561703763061757743.png
[3]: http://img2.ph.126.net/uHM9MmUmlJk8moJlVyNTmw==/2568459162502797428.png
[4]: http://img1.ph.126.net/g2fw5Z1OtPBgE0cbn-HBqw==/6608233108214335942.png
[5]: http://img0.ph.126.net/iC46e1bXkU1f1rIfUZo99w==/6597620621984019408.gif

