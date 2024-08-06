#ifndef CONTEXT_H
#define CONTEXT_H

#include "State.h"

class Context {
    private:
        State* state;

    public:
        Context(State* initialState) : state(initialState){}
        void setState(State* newState) {
            state = newState;
        }
        void request(){
            state->handle(this);
        }
};

#endif