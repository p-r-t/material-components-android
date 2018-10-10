/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.material.resources;

import android.graphics.Typeface;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.res.ResourcesCompat.FontCallback;

/** {@link FontCallback} font fetch, in case a different font is set / requested in the meantime. */
@RestrictTo(Scope.LIBRARY_GROUP)
public abstract class TextAppearanceFontCallback {
  /**
   * Called when an asynchronous font was finished loading.
   *
   * @param typeface Font that was loaded.
   * @param fontResolvedSynchronously Whether the font was loaded synchronously, because it was
   *     already available.
   */
  public abstract void onFontRetrieved(Typeface typeface, boolean fontResolvedSynchronously);

  /** Called when an asynchronous font failed to load. */
  public abstract void onFontRetrievalFailed(int reason);
}
