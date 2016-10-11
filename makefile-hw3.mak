JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
				$(JC) $(JFLAGS) $*.java 
				
CLASSES = \
				Main.java \
				Main.java \
				TableLamp.java \
				ElectricPowerSwitch.java \
				ElectricPowerSwitchTest.java \
				Fan.java \
				Lightbulb.java \
				Main.java \
				Switch.java \
				Switchable.java
				
default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class 