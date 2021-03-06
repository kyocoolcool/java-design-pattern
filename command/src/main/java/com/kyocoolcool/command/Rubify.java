/**
 * MIT License
 * <p>
 * Copyright (c) 2017 James
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.kyocoolcool.command;

/**
 * 设置字体颜色为红色的命令
 */
public class Rubify extends Command {

  private final AbstractFont font;
  private final Color oriColor;

  public Rubify(AbstractFont font) {
    this.font = font;
    oriColor = font.getColor();
  }

  @Override
  public void execute() {
    font.setColor(Color.RED);
  }

  @Override
  public void undo() {
    font.setColor(oriColor);
  }

  @Override
  public void redo() {
    execute();
  }

  @Override
  public String toString() {
    return "设置字体为红色";
  }
}
