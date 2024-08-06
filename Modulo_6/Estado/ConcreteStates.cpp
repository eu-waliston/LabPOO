#include "ConcreteStates.h"
#include "Context.h"

extern State* readyState;
extern State* waitingState;
extern State* soldState;

void ReadyState::handle(Context* context) {
    std::cout << "Machine is in ready state" << std::endl;
    context->setState(waitingState);
}

void WaitingState::handle(Context* context) {
    std::cout << "Machine is waiting for action" << std::endl;
    context->setState(soldState);
}

void SoldState::handle(Context* context) {
    std::cout << "Item has been sold" << std::endl;
    context->setState(waitingState);
}
