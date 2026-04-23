// frontend/my-blog-app/src/components/BlogPosts.js

import React, { useEffect, useState } from 'react';
import axios from 'axios';

const apiUrl = 'http://localhost:8181'; // Replace with your Spring Boot backend URL

const BlogPosts = () => {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    // Fetch blog posts when the component mounts
    axios.get(`${apiUrl}/api/posts`)
      .then(response => {
        setPosts(response.data);
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
      });
  }, []); // The empty dependency array means this effect runs once after the initial render

  return (
    <div>
      <h2>Blog Posts</h2>
      <ul>
        {posts.map(post => (
          <li key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.content}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogPosts;
