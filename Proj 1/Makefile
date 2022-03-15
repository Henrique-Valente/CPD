compile: matrixproduct.cpp
	@g++ -O2 matrixproduct.cpp -o fileout -lpapi

run: fileout
	@./fileout

papi: 
	@#Usado por causa do bug do papi
	@sudo sh -c 'echo -1 >/proc/sys/kernel/perf_event_paranoid' 