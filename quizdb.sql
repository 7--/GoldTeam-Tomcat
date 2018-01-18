




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

CREATE SEQUENCE SQ_Users_PK
START WITH 1
INCREMENT BY 1;

drop table Users;
/
select * from users;
INSERT INTO Users(UserId, Email, uPassword, CorrectAnswers, WrongAnswers, FirstName, LastName) VALUES (3,'regop412@gmail.com', 'p4ssw0rd',0,0,'Philip','Rego');
/
