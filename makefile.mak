JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java
		
CLASSES = \
		TestCreature.java \
		Creature.java \
		Thing.java \
		Ant.java \
		Fly.java \
		Bat.java \
		Flyer.java
		
default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class 