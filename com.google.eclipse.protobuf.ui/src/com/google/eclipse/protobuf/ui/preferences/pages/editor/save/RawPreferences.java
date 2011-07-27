/*
 * Copyright (c) 2011 Google Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse License v1.0 which accompanies this
 * distribution, and is available at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.google.eclipse.protobuf.ui.preferences.pages.editor.save;

import com.google.eclipse.protobuf.ui.preferences.BooleanPreference;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author alruiz@google.com (Alex Ruiz)
 */
class RawPreferences {

  private final BooleanPreference removeTrailingWhitespace;

  RawPreferences(IPreferenceStore store) {
    removeTrailingWhitespace = new BooleanPreference("saveActions.removeTrailingWhitespace", store);
  }

  BooleanPreference removeTrailingWhitespace() {
    return removeTrailingWhitespace;
  }
}