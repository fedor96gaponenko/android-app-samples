/*
 * Copyright (C) 2013 The Android Open Source Project
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

package net.simplyadvanced.exampleflipanimation.app.flip4;

/**
 * This interface is used to prevent flipping multiple cards at the same time.
 * These callback methods are used to disable and re-enable touches when a card
 * flip animation begins and ends respectively.
 * */
public interface CardFlipListener {
    public void onCardFlipEnd();
    public void onCardFlipStart();
}
