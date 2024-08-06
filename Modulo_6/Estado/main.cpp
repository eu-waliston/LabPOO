#include <iostream>
#include "ConcreteStates.h"
#include "Context.h"

State* readyState = new ReadyState();
State* waitingState = new WaitingState();
State* soldState = new SoldState();

int main() {
    Context context(readyState);

    context.request();
    context.request();
    context.request();

    delete readyState;
    delete waitingState;
    delete soldState;

    return 0;
}