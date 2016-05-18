package com.victormartin.projectcawd.domain.interactors.impl;

import com.victormartin.projectcawd.domain.executor.Executor;
import com.victormartin.projectcawd.domain.executor.MainThread;
import com.victormartin.projectcawd.domain.interactors.UserInteractor;
import com.victormartin.projectcawd.domain.interactors.base.AbstractInteractor;
import com.victormartin.projectcawd.domain.repository.UserRepository;

/**
 * This is an interactor boilerplate with a reference to a model repository.
 * <p/>
 */
public class UserInteractorImpl extends AbstractInteractor implements UserInteractor {

    private UserInteractor.Callback mCallback;
    private UserRepository mUserRepository;

    public UserInteractorImpl(Executor threadExecutor,
                              MainThread mainThread,
                              Callback callback, UserRepository userRepository) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mUserRepository = userRepository;
    }

    @Override
    public void run() {
        // TODO: Implement this with your business logic
    }
}
