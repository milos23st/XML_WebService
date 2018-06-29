package com.xml.config;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class PwCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

			if (pc.getUsage() == WSPasswordCallback.SIGNATURE || pc.getUsage() == WSPasswordCallback.DECRYPT) {
				if (pc.getIdentifier().equals("tomcat")) {
					pc.setPassword("test123");
				}
			}
		}
	}

}
