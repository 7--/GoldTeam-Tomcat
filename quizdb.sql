CREATE TABLE Quiz
(
    QuizId NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    Name VARCHAR2(160) NOT NULL,
    
    CONSTRAINT PK_Quiz PRIMARY KEY  (QuizId)
);
/
INSERT INTO Quiz(Name) VALUES ('Sports');
INSERT INTO Quiz(Name) VALUES ('Science');
/
SELECT * FROM Quiz;

CREATE TABLE Question 
(
    QuestionId NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
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
INSERT INTO Question(Quiz, Question, Choice1, Choice2, Choice3, Choice4, Answer) VALUES (1, 'Which QB has the most playoff wins?', 'Joe Montana', 'Peyton Manning', 'Tom Brady', 'Johnny Unitas', 3);
/
SELECT * FROM Question;


CREATE TABLE Users
(
    UserId NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    Email VARCHAR2(160) NOT NULL,
    Password VARCHAR2(160) NOT NULL,
    CorrectAnswers NUMBER,
    WrongAnswers NUMBER,
    FirstName VARCHAR2(160),
    LastName VARCHAR2(160),
     
    CONSTRAINT PK_Users PRIMARY KEY  (UserId)
);
/
INSERT INTO Users( Email, Password, CorrectAnswers, WrongAnswers, FirstName, LastName) VALUES ('regop412@gmail.com', 'p4ssw0rd',0,0,'Philip','Rego');
/
SELECT * FROM Users;