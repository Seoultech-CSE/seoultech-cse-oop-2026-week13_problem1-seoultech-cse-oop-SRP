### Exercise 1: Single Responsibility Principle (SRP)

#### 📖 Background
The Single Responsibility Principle (SRP) states that a class should have a single responsibility. If a class has many responsibilities, it increases the possibility of bugs because making changes to one of its responsibilities could affect the other ones without you knowing. This principle aims to separate behaviors so that if bugs arise as a result of your change, it won’t affect other unrelated behaviors.

In our current system, the `Book` class is responsible for managing the data of a book (name, author, text) AND handling the output format (printing to the console or writing to a file). This violates the single responsibility principle.

#### 🎯 Objective
Refactor the provided skeleton code to comply with the Single Responsibility Principle.

#### 📝 Instructions
1. Open `Book.java` in the current folder.
2. Identify the methods that are not related to managing the book's properties (hint: the printing methods).
3. Create a new class named `BookPrinter.java` in the same folder.
4. Move the output/printing responsibilities from the `Book` class to the new `BookPrinter` class.
5. **DO NOT modify `Main.java`**. Run `Main.java` to see if your refactoring is automatically detected. It will print a ✅ Success message if done correctly.

#### ✅ Grading Criteria
* Does the `Book` class only handle data related to the book?
* Is there a separate class (`BookPrinter`) exclusively handling the printing logic?
* Does the automated test pass when pushed to GitHub?

---

#### 📖 배경 상황
단일 책임 원칙(SRP)은 하나의 클래스가 단 하나의 책임만을 가져야 한다는 원칙입니다. 클래스가 여러 책임을 가지게 되면, 하나의 책임을 변경할 때 자신도 모르게 다른 책임에 영향을 미칠 수 있어 버그 발생 가능성이 높아집니다. 이 원칙의 목표는 행동들을 분리하여, 코드 변경으로 인해 발생하는 버그가 관련 없는 다른 행동에 영향을 주지 않도록 하는 것입니다.

현재 제공된 시스템에서 `Book` 클래스는 책의 데이터(이름, 저자, 텍스트)를 저장하고 관리하는 역할뿐만 아니라, 콘솔에 텍스트를 출력하거나 파일에 쓰는 역할까지 함께 수행하고 있습니다. 이는 앞서 설명한 단일 책임 원칙을 명백히 위반한 설계입니다.

#### 🎯 실습 목표
제공된 뼈대 코드(Skeleton code)를 단일 책임 원칙에 맞게 리팩토링하세요.

#### 📝 수행 지침
1. 현재 폴더에 있는 `Book.java` 파일을 엽니다.
2. 책의 속성을 관리하는 것과 직접적인 관련이 없는 출력 관련 메서드들을 확인합니다.
3. 동일한 폴더 내에 `BookPrinter.java`라는 새로운 클래스를 생성합니다.
4. `Book` 클래스에 있던 출력/인쇄 관련 책임(메서드)들을 새롭게 만든 `BookPrinter` 클래스로 이동시킵니다.
5. **`Main.java` 파일은 절대 수정하지 마세요.** 리팩토링 완료 후 `Main.java`를 실행하면 리플렉션(Reflection)을 통해 여러분이 만든 클래스를 자동으로 감지하고 ✅ 성공 메시지를 출력합니다.

#### ✅ 평가 기준
* `Book` 클래스가 책과 관련된 데이터만을 관리하도록 관심사가 분리되었는가?
* 인쇄 및 출력 로직을 전담하는 별도의 클래스(`BookPrinter`)가 올바르게 생성되었는가?
* GitHub에 코드를 Push 했을 때 자동 채점 테스트를 통과하는가?