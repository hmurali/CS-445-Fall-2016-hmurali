JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
				$(JC) $(JFLAGS) $*.java
				
CLASSES = \
				Consumer.java \
				Product.java \
				Search.java \
				Delivery.java \
				Farmer.java \
				Store.java \
				Manager.java \
				Catalog.java 
				
default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class 