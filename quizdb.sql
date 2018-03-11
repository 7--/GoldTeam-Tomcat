




CREATE TABLE Quiz
(
    QuizId NUMBER,
    Name VARCHAR2(160) NOT NULL,
    
    CONSTRAINT PK_Quiz PRIMARY KEY  (QuizId)
);
CREATE SEQUENCE SQ_QUIZ_PK
START WITH 1
INCREMENT BY 1;
/
INSERT INTO Quiz(QuizId,Name) VALUES (1,'Sports');
INSERT INTO Quiz(QuizId,Name) VALUES (2,'Science');
INSERT INTO Quiz(QuizId,Name) VALUES (3,'History');
INSERT INTO Quiz(QuizId,Name) VALUES (4,'Geography');
/
SELECT * FROM Quiz;

CREATE TABLE Question 
(
    QuestionId NUMBER,
    Quiz Number NOT NULL,
    Question VARCHAR2(2000),
    Choice1 VARCHAR2(1000),
    Choice2 VARCHAR2(1000),
    Choice3 VARCHAR2(1000),
    Choice4 VARCHAR2(1000),
    Answer Number,
    
    CONSTRAINT PK_Question PRIMARY KEY  (QuestionId)
);
/
ALTER TABLE Question ADD CONSTRAINT FK_QuestionQuiz
    FOREIGN KEY (Quiz) REFERENCES Quiz(QuizId);
/
CREATE SEQUENCE SQ_Question_PK
START WITH 1
INCREMENT BY 1;
/
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (1, 1, 'Which QB has the most playoff wins?', 'Joe Montana', 'Peyton Manning', 'Tom Brady', 'Johnny Unitas', 3);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (2, 1, 'What Chicago Bears running back was known as "The Galloping Ghost?', 'Harold Grange', 'Jim Brown', 'Walter Peyton', 'Gale Sayers', 1);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (3, 1, 'What pitcher holds the record for most complete games in an MLB career?', 'Don Sutton', 'Cy Young', 'Roy Halladay', 'Nolan Ryan', 2);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (4, 1, 'What was the biggest margin of victory ever in a Triple Crown race?', '12 lengths', '18 lengths', ' 25 lengths', '31 lengths', 4);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (5, 1, 'What coach came off the bench to play for his team in the Stanley Cup finals?', 'Wayne Gretzky', 'Dick Irvin', 'Lester Patrick', 'Tom Blake', 3);

INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (6, 2, 'What type of scientist studies motion?', 'Biologist', 'Physicist', 'Chemist', 'Geologist', 2);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (7, 2, 'What is a force?', 'A Push or a Pull', 'Weight', 'Resist a change in motion', 'Mass', 1);

INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (8, 3, 'World War I began in which year?', '1923', '1938', '1917', '1914', 4);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (9, 3, 'John F. Kennedy was assassinated in?', '1973', 'Austin', 'Dallas', '1958', 3);

INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (10, 4, 'What is Earths largest continent?', 'Antartica', 'Asia', 'South America', 'Europe', 2);
INSERT INTO Question(QuestionId, Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (11, 4, 'What country has the most natural lakes?', 'Canada', 'Australia', 'India', 'United States', 1);



delete from QUESTION where QUESTIONID=2
/
SELECT * FROM Question;


CREATE TABLE Users
(
    UserId NUMBER,
    Email VARCHAR2(160) NOT NULL,
    uPassword VARCHAR2(160) NOT NULL,
    CorrectAnswers NUMBER,
    WrongAnswers NUMBER,
    FirstName VARCHAR2(160),
    LastName VARCHAR2(160),
     
    CONSTRAINT PK_Users PRIMARY KEY  (UserId)
);
/
ALTER TABLE Users
ADD CONSTRAINT Email_unique UNIQUE (Email);
/

CREATE SEQUENCE SQ_Users_PK
START WITH 1
INCREMENT BY 1;

drop table Users;
/
delete from users where email='tester@testmail.com';
select * from users;
INSERT INTO Users(UserId, Email, uPassword, CorrectAnswers, WrongAnswers, FirstName, LastName) VALUES (3,'regop412@gmail.com', 'p4ssw0rd',0,0,'Philip','Rego');
/
