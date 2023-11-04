import React from 'react';

const AnswerForm = ({index, answer, changeCorrect, changeAnswer, deleteAnswer, isDeletable}) => {
  return (
    <div className="p-2 grid grid-cols-12 items-center">
      <div className="col-span-9">
        <label htmlFor={"answer-" + answer.index}
               className="text-white ml-4">{(index + 1) + ". answer: "}</label>
        <input className="ml-1 bg-[#050409] text-white p-1 border border-zinc-700 w-4/6" value={answer.text}
               type="text" id={"answer-" + answer.index}
               onChange={(e) => changeAnswer({
                 isCorrect: answer.isCorrect,
                 answerId: answer.answerId,
                 text: e.target.value,
                 index: answer.index
               })}
        />
        {isDeletable ?
          <button className="text-white px-2 ml-4 bg-red-700 hover:bg-red-600 hover:cursor-pointer"
                  onClick={() => deleteAnswer(answer.index)}
          >
            -
          </button>
          : null
        }
      </div>
      <div className="col-span-3">
        <label htmlFor={"checkbox-" + answer.index} className="text-white">Correct: </label>
        <input type="checkbox" defaultChecked={answer.isCorrect} id={"checkbox-" + answer.index}
               className="scale-150 m-1 accent-stone-600 hover:cursor-pointer"
               onChange={(e) => changeCorrect(e.target.checked, answer.index)}/>
      </div>
    </div>
  );
};

export default AnswerForm;
