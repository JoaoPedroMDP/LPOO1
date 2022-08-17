clear:
	find . -name "*.class" -type f -delete

compile:
	javac L$(L)/EX$(E)/*.java
