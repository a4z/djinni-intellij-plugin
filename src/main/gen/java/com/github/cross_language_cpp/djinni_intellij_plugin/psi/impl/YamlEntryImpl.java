// This is a generated file. Not intended for manual editing.
package com.github.cross_language_cpp.djinni_intellij_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.cross_language_cpp.djinni_intellij_plugin.psi.YamlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.cross_language_cpp.djinni_intellij_plugin.psi.*;

public class YamlEntryImpl extends ASTWrapperPsiElement implements YamlEntry {

  public YamlEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YamlVisitor visitor) {
    visitor.visitEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YamlVisitor) accept((YamlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YamlLhs getLhs() {
    return findChildByClass(YamlLhs.class);
  }

  @Override
  @Nullable
  public YamlRhs getRhs() {
    return findChildByClass(YamlRhs.class);
  }

  @Override
  @Nullable
  public PsiElement getSeparator() {
    return findChildByType(SEPARATOR);
  }

}
