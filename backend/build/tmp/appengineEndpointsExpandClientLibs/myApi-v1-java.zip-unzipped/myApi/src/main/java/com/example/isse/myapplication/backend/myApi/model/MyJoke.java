/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-07-08 17:28:43 UTC)
 * on 2016-10-15 at 09:20:54 UTC 
 * Modify at your own risk.
 */

package com.example.isse.myapplication.backend.myApi.model;

/**
 * Model definition for MyJoke.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MyJoke extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String joke;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getJoke() {
    return joke;
  }

  /**
   * @param joke joke or {@code null} for none
   */
  public MyJoke setJoke(java.lang.String joke) {
    this.joke = joke;
    return this;
  }

  @Override
  public MyJoke set(String fieldName, Object value) {
    return (MyJoke) super.set(fieldName, value);
  }

  @Override
  public MyJoke clone() {
    return (MyJoke) super.clone();
  }

}
