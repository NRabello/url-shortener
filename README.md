<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <header>
    <h1>URL Shortener</h1>
    <p>A URL Shortener application built with Java and JPA for the backend, MongoDB in Docker for the database, and React with Next.js for the frontend. This application allows users to input a URL and click on "Shorten" to get a shortened URL that redirects to the original URL.</p>
  </header>

  <section class="features">
    <h2>Features</h2>
    <ul>
      <li>Shorten URLs with ease</li>
      <li>Java with JPA for backend</li>
      <li>MongoDB in Docker for database</li>
      <li>React and Next.js for frontend</li>
    </ul>
  </section>

  <section class="technologies">
    <h2>Technologies Used</h2>
    <ul>
      <li><a href="https://www.java.com" target="_blank">Java</a></li>
      <li><a href="https://jakarta.ee/specifications/persistence" target="_blank">JPA</a></li>
      <li><a href="https://www.mongodb.com" target="_blank">MongoDB</a></li>
      <li><a href="https://www.docker.com" target="_blank">Docker</a></li>
      <li><a href="https://reactjs.org" target="_blank">React</a></li>
      <li><a href="https://nextjs.org" target="_blank">Next.js</a></li>
      <li><a href="https://developer.mozilla.org/en-US/docs/Web/HTML" target="_blank">HTML</a></li>
      <li><a href="https://developer.mozilla.org/en-US/docs/Web/CSS" target="_blank">CSS</a></li>
    </ul>
  </section>

  <section class="installation">
    <h2>Installation</h2>
    <ol>
      <li>Clone the repository: <code>git clone https://github.com/NRabello/url-shortener.git</code></li>
      <li>Navigate to the backend directory and install dependencies: <code>cd backend && mvn install</code></li>
      <li>Start the MongoDB container: <code>docker-compose up -d</code></li>
      <li>Start the backend server: <code>mvn spring-boot:run</code></li>
      <li>Navigate to the frontend directory and install dependencies: <code>cd ../frontend && npm install</code></li>
      <li>Start the frontend server: <code>npm run dev</code></li>
      <li>Open your browser and navigate to <code>http://localhost:3000</code></li>
    </ol>
  </section>

  <section class="contact">
    <h2>Contact</h2>
    <p>For inquiries and feedback, please feel free to contact me at: <a href="mailto:nic.rabello@gmail.com">nic.rabello@gmail.com</a></p>
  </section>
</body>
</html>
