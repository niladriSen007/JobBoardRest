import { BrowserRouter, Route, Routes } from "react-router-dom"
import "./App.css"
import Navbar from "./components/Navbar"
import Search from "./components/Search"
import Edit from "./components/Edit"
import Create from "./components/Create"

function App() {
  return (
    <>
      <Navbar />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Search />} />
          <Route path="/create" element={<Create />} />
          <Route path="/edit" element={<Edit />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
