#ifndef CONCRETESTATES_H
#define CONCRETESTATES_H

class ReadyState : public State {
public:
    void handle(Context* context) override;
};

class WaitingState : public State {
public:
    void handle(Context* context) override;
};

class SoldState : public State {
public:
    void handle(Context* context) override;
}

#endif