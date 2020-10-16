/*
 * Copyright 2015 Dropbox, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl;

import com.github.cross_language_cpp.djinni_intellij_plugin.DjinniIcons;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.YamlRhs;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by jaetzold on 8/11/15.
 */
public class YamlPsiImplUtil {
  public static String getName(YamlRhs value) {
    return value.getText();
  }

  public static ItemPresentation getPresentation(final YamlRhs value) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return value.getText();
      }

      @Nullable
      @Override
      public String getLocationString() {
        PsiFile containingFile = value.getContainingFile();
        return containingFile != null ? containingFile.getName() : null;
      }

      @Nullable
      @Override
      public Icon getIcon(boolean unused) {
        return DjinniIcons.FILE;
      }
    };
  }
}
